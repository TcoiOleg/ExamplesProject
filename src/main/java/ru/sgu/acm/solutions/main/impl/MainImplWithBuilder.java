package ru.sgu.acm.solutions.main.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.sgu.acm.solutions.BeanConstants;
import ru.sgu.acm.solutions.TasksContext;
import ru.sgu.acm.solutions.main.Main;
import ru.sgu.acm.solutions.task.executors.TaskExecutor;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * User: 1
 * Date: 15.07.15
 */

public class MainImplWithBuilder implements Main {
    private static final Logger LOGGER = LogManager.getLogger(MainImplWithBuilder.class);

    private Scanner scanner; // todo must be input stream
    private TaskExecutor taskExecutor;
    private PrintStream outStream;

    @Override
    public void runMain() {
        outStream.println("Enter task number: ");
        String taskNumberStr;
        while (!tryParse(taskNumberStr = scanner.nextLine())) {
            outStream.println("It's not a number, please enter task number: ");
        }
        final int taskNumber = Integer.parseInt(taskNumberStr);
        outStream.println("Enter tasks input values: ");
        taskExecutor.executeTaskByNumber(scanner, taskNumber);
    }

    public static boolean tryParse(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    // create main only via builder
    private MainImplWithBuilder(Builder mainBuilder) {
        this.taskExecutor = mainBuilder.getTaskExecutor();
        this.scanner = mainBuilder.getScanner();
        this.outStream = mainBuilder.getOutStream();
        LOGGER.info("main with scanner:{}\ntask executor:{}\noutStream:{}",
                this.scanner, this.taskExecutor, this.outStream);
    }

    public static class Builder {

        private static final Logger LOGGER = LogManager.getLogger(Builder.class);

        // by default
        private Scanner scanner = new Scanner(System.in);
        private TaskExecutor taskExecutor = (TaskExecutor) TasksContext.getBean(BeanConstants.taskExecutor);
        private PrintStream outStream = System.out;

        public MainImplWithBuilder build() {
            return new MainImplWithBuilder(this);
        }

        public Builder taskExecutor(TaskExecutor taskExecutor) {
            LOGGER.trace("not default taskExecutor: {}", taskExecutor);
            this.taskExecutor = taskExecutor;
            return this;
        }
        public Builder scanner(Scanner scanner) {
            LOGGER.trace("not default scanner: {}", scanner);
            this.scanner = scanner;
            return this;
        }
        public Builder outStream(PrintStream outStream) {
            LOGGER.trace("not default outStream: {}", outStream);
            this.outStream = outStream;
            return this;
        }

        // only copies of fields
        public Scanner getScanner() {
            return scanner;
        }
        public TaskExecutor getTaskExecutor() {
            try {
                return (TaskExecutor) taskExecutor.clone();
            } catch (CloneNotSupportedException e) {
                LOGGER.error(e.getMessage());
                return null;
            }
        }
        public PrintStream getOutStream() {
            return outStream;
        }
    }
}

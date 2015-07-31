package ru.sgu.acm.solutions.patterns.bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.sgu.acm.solutions.task.Task;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * User: 1
 * Date: 31.07.15
 */
// bridge pattern allow execute tasks independently from their realization
public class TaskExecutorBridgePattern {
    private static final Logger LOGGER = LogManager.getLogger(TaskExecutorBridgePattern.class);

    private Queue<Task> taskQueue;
    private Scanner scanner;

    public TaskExecutorBridgePattern(InputStream inputStream, Task task) {
        taskQueue = new LinkedList<>();
        this.scanner = new Scanner(inputStream);
        taskQueue.add(task);
    }

    // execute next task in queue
    public String executeTask() {
        LOGGER.trace("execute task: {}", taskQueue.peek().getClass().getName());
        return taskQueue.poll().execute(this.scanner);
    }

    public String executeTask(Task task) {
        return task.execute(this.scanner);
    }

    public Task getTask() {
        return taskQueue.peek();
    }

    public void addTask(Task task) {
        this.taskQueue.add(task);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}

package ru.sgu.acm.solutions.task.executors.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.sgu.acm.solutions.task.Task;
import ru.sgu.acm.solutions.task.executors.TaskExecutor;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;

/**
 * User: 1
 * Date: 28.07.15
 */
public class TaskExecutorToFile extends TaskExecutor {

    private Map<String, Task> taskMap;
    private String pathToInput;
    private String pathToOutput;
    private static final Logger LOGGER = LogManager.getLogger(TaskExecutorToFile.class);

    @Override
    public void executeTaskByNumber(Scanner scanner, int taskNumber) throws IllegalAccessException, InstantiationException, IOException {

        File file = new File(pathToOutput);
        if (!file.exists()) {
            LOGGER.trace("create file from path: {}", pathToOutput);
            try {
                file.createNewFile();
            } catch (IOException e) {
                LOGGER.error("FIle exception: {}", e.getMessage());
            }
        }
        LOGGER.trace("get file from path: {}", pathToOutput);
        PrintStream printStream = new PrintStream(file);

        LOGGER.trace("Execute task: {}", taskNumber);
        Task task = taskMap.get(String.valueOf(taskNumber));
        task.initInputData(scanner);
        printStream.println(task.execute());
    }


    public void setTaskMap(Map<String, Task> taskMap) {
        this.taskMap = taskMap;
    }

    public String getPathToOutput() {
        return pathToOutput;
    }

    public void setPathToOutput(String pathToOutput) {
        this.pathToOutput = pathToOutput;
    }

    public String getPathToInput() {
        return pathToInput;
    }

    public void setPathToInput(String pathToInput) {
        this.pathToInput = pathToInput;
    }
}

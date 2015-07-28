package ru.sgu.acm.solutions.task.executors.impl;

import ru.sgu.acm.solutions.task.Task;
import ru.sgu.acm.solutions.task.executors.TaskExecutor;

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

    @Override
    public void executeTaskByNumber(Scanner scanner, int taskNumber, PrintStream outputStream) throws IllegalAccessException, InstantiationException {
        for (Map.Entry<String, Task> entry : taskMap.entrySet())
        {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
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

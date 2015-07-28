package ru.sgu.acm.solutions.task.executors;

import java.io.IOException;
import java.util.Scanner;

/**
 * User: 1
 * Date: 28.07.15
 */
public abstract class TaskExecutor {

    public abstract void executeTaskByNumber(Scanner scanner, int taskNumber)
            throws IllegalAccessException, InstantiationException, IOException;

}

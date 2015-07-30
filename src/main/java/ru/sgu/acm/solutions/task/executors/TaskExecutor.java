package ru.sgu.acm.solutions.task.executors;

import java.util.Scanner;

/**
 * User: 1
 * Date: 28.07.15
 */
public abstract class TaskExecutor implements Cloneable {
    public abstract void executeTaskByNumber(Scanner scanner, int taskNumber);

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

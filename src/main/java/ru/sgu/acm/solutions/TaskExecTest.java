package ru.sgu.acm.solutions;

import ru.sgu.acm.solutions.work.TaskExecutor;

import java.io.InputStream;

/**
 * User: 1
 * Date: 08.09.15
 */
public class TaskExecTest {

    public static void main(String[] args) {
        System.out.println("Hi");
        TaskExecutor taskExecutor = new TaskExecutor();
        InputStream inputStream = System.in;
        System.out.println(taskExecutor.executeTask("digitSumTaskImpl2001", inputStream));
    }
}

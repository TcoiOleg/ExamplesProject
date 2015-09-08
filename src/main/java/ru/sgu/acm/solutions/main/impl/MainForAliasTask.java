package ru.sgu.acm.solutions.main.impl;

import ru.sgu.acm.solutions.main.Main;
import ru.sgu.acm.solutions.work.TaskExecutor;

import java.io.InputStream;

/**
 * User: 1
 * Date: 09.09.15
 */
public class MainForAliasTask implements Main {
    @Override
    public void runMain() {
        System.out.println("Hi");
        TaskExecutor taskExecutor = new TaskExecutor();
        InputStream inputStream = System.in;
        // digitSumTaskImpl2001 - alias for task2001
        System.out.println(taskExecutor.executeTask("digitSumTaskImpl2001", inputStream));
    }
}

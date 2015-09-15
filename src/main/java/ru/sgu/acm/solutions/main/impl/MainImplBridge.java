package ru.sgu.acm.solutions.main.impl;

import ru.sgu.acm.solutions.main.Main;
import ru.patterns.bridge.TaskExecutorBridgePattern;
import ru.sgu.acm.solutions.task.taskimpls.RoundNumbersBinaryTaskImpl2007;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * User: 1
 * Date: 31.07.15
 */
public class MainImplBridge implements Main {

    @Override
    public void runMain() {
        InputStream inputStream = System.in;
        PrintStream out = System.out;
        out.println("Enter 2007 tasks input values: ");
        TaskExecutorBridgePattern taskExecutor = new TaskExecutorBridgePattern(inputStream, new RoundNumbersBinaryTaskImpl2007());
        out.println(taskExecutor.executeTask());
    }
}

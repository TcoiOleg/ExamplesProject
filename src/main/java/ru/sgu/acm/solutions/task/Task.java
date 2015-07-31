package ru.sgu.acm.solutions.task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 15.07.15
 */
// strategy in Template: Strategy
// bridge in template: bridge via TaskExecutorBridgePattern and Task implementations
public interface Task {
    String execute(Scanner scanner);
}

package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 17.07.15
 */
public class LeapYearTaskImpl2004 implements Task {
    @Override
    public String execute(Scanner scanner) {
        String inputData = scanner.nextLine();
        int year = Integer.parseInt(inputData);
        return String.valueOf(((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 1 : 0);
    }
}

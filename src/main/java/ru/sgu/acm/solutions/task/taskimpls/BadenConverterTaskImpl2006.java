package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 28.07.15
 */
public class BadenConverterTaskImpl2006 implements Task {
    @Override
    public String execute(Scanner scanner) {
        String inputData = scanner.nextLine();
        double lengthInCM = Double.parseDouble(inputData);
        return String.valueOf((int)(lengthInCM / 36)) + " " + String.valueOf((int)(lengthInCM % 36 / 3));
    }
}

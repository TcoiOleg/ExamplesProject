package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 28.07.15
 */
public class BadenConverterTaskImpl2006 implements Task {
    @Override
    public String execute() {
        double lengthInCM = Double.parseDouble(inputData.get(0));
        return String.valueOf((int)(lengthInCM / 36)) + " " + String.valueOf((int)(lengthInCM % 36 / 3));
    }

    @Override
    public void initInputData(Scanner scanner) {
        inputData.add(scanner.nextLine());
    }
}

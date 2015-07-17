package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 16.07.15
 */
public class DigitSumTaskImpl2001 implements Task {

    @Override
    public String execute() {
        int a = Integer.parseInt(inputData.get(0));
        int b = Integer.parseInt(inputData.get(1));
        return String.valueOf(a + b);
    }

    @Override
    public void initInputData(Scanner scanner) {
        String[] firstSecondDigit = scanner.nextLine().split(" ");
        inputData.add(firstSecondDigit[0]);
        inputData.add(firstSecondDigit[1]);
    }
}

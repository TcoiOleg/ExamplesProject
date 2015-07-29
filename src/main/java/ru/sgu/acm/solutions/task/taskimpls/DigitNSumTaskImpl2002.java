package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Arrays;
import java.util.Scanner;

/**
 * User: 1
 * Date: 17.07.15
 */
public class DigitNSumTaskImpl2002 implements Task {
    @Override
    public String execute(Scanner scanner) {
        scanner.nextLine();
        String inputData = scanner.nextLine();
        return String.valueOf(
                Arrays.asList(inputData.split(" ")).stream().mapToInt(Integer::parseInt).sum());
    }
}

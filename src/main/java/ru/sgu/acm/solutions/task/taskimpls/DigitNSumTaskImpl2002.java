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
    public String execute() {
        return String.valueOf(
                Arrays.asList(inputData.get(0).split(" ")).stream().mapToInt(Integer::parseInt).sum());
    }

    @Override
    public void initInputData(Scanner scanner) {
        scanner.nextLine();
        inputData.add(scanner.nextLine());
    }
}

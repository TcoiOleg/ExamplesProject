package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 10.10.15
 */
public class TriangleShelfTaskImpl2019 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt(), sum = 1, shelfNumber = 1;
        while (n != sum) {
            sum += shelfNumber++;
        }
        return String.valueOf(shelfNumber);
    }
}

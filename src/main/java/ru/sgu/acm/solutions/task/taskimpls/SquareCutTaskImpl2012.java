package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 07.10.15
 */
public class SquareCutTaskImpl2012 implements Task {

    @Override
    public String execute(Scanner scanner) {
        int i = 0, max = -10000;
        int mas[] = new int[4];
        while (i++ < 4) {
            mas[i - 1] = scanner.nextInt();
            max = max < mas[i - 1] ? mas[i - 1] : max;
        }
        return mas[0] * mas[1] + mas[2] * mas[3] == max * max ? "YES" : "NO";
    }
}

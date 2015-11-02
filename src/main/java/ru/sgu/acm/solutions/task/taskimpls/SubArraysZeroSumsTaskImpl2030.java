package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 28.10.15
 */
public class SubArraysZeroSumsTaskImpl2030 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt(), sum, cnt = 0;
        int mas[] = new int[n];
        while (n-- > 0) {
            mas[n] = scanner.nextInt();
        }
        for (int i = 0; i < mas.length; i++) {
            sum = 0;
            for (int j = i; j < mas.length; j++) {
                sum += mas[j];
                if (sum == 0) {
                    cnt++;
                }
            }
        }
        return String.valueOf(cnt);
    }
}

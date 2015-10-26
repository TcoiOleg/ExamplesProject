package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 12.10.15
 */
public class CreatePalindromTaskImpl2024 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt(), cnt = 0;
        int mas[] = new int[n];
        while (n-- > 0) {
            mas[n] = scanner.nextInt();
        }
        for (int i = 0; i < mas.length / 2; i++) {
            if (mas[i] != mas[mas.length - i - 1]) {
                cnt++;
            }
        }
        return String.valueOf(cnt);
    }
}

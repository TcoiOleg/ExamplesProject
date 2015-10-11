package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 10.10.15
 */
public class DivisionsPairsTaskImpl2022 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt(), cnt, max = -1000000;
        int mas[] = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            cnt = 0;
            for (int j = i + 1; j < n; j++) {
                if (mas[i] % mas[j] == 0) {
                    cnt++;
                }
                if (mas[j] % mas[i] == 0) {
                    cnt++;
                }
            }
            if (max < cnt) {
                max = cnt;
            }
        }
        return String.valueOf(max);
    }
}

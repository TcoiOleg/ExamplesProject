package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 28.10.15
 */
public class MiddleMinTaskImpl2029 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt(), min = 10000000, cntMin = 0;
        int mas[] = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = scanner.nextInt();
            if (mas[i] == min) {
                cntMin++;
            }
            if (min > mas[i]) {
                min = mas[i];
                cntMin = 1;
            }
        }
        cntMin = cntMin % 2 == 0 ? cntMin / 2 : cntMin / 2 + 1;
        for (int i = 0; i < n; i++) {
            if (mas[i] == min) {
                cntMin--;
            }
            if (cntMin == 0) {
                return String.valueOf(i + 1);
            }
        }
        return "";
    }
}

package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 10.10.15
 */
public class DivisionMaxTaskImpl2021 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt(), max = -100, prevMax = max;
        int mas[] = new int[n];
        while (n-- > 0) {
            mas[n] = scanner.nextInt();
            if (max < mas[n]) {
                prevMax = max;
                max = mas[n];
            }
        }
        StringBuilder ans = new StringBuilder("");
        for (int i = mas.length - 1; i >= 0; i--) {
            if (mas[i] == max || mas[i] == prevMax) {
                mas[i] /= 2;
            }
            ans.append(mas[i]).append(" ");
        }
        return ans.toString();
    }
}

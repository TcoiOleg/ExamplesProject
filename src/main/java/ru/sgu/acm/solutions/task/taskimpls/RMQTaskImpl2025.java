package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 13.10.15
 */
public class RMQTaskImpl2025 implements Task {
    @Override
    public String execute(Scanner scanner) {
        StringBuilder ans = new StringBuilder("");
        int n = scanner.nextInt(), i = 0, m;
        int mas[] = new int[n];
        while (i++ < n) {
            mas[i - 1] = scanner.nextInt();
        }
        m = scanner.nextInt();
        while (m-- > 0) {
            ans.append(getMinFromInds(mas, scanner.nextInt(), scanner.nextInt()));
        }
        return ans.toString();
    }

    public int getMinFromInds(int mas[], int i, int j) {
        int min = 10000000;
        i--; j--;
        for (int k = i; k <= j; k++) {
            if (min > mas[k]) {
                min = mas[k];
            }
        }
        return min;
    }

}

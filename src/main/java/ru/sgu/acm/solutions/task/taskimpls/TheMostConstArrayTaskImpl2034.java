package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 02.11.15
 */
public class TheMostConstArrayTaskImpl2034 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt(), cnt, maxCnt = -1111111111, min, max;
        boolean t;
        int mas[] = new int[n], res[] = new int[2];
        for (int i = 0; i < n; i++) {
            mas[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            min = max = mas[i];
            cnt = 0;
            t = false;
            for (int j = i; j < mas.length; j++) {
                if (mas[j] != min && Math.abs(min - mas[j]) < 2 && !t) {
                    max = mas[j];
                    t = !t;
                }
                if (mas[j] == min || mas[j] == max) {
                    cnt++;
                    if (cnt > maxCnt) {
                        res[0] = i + 1;
                        res[1] = j + 1;
                    }
                }
                else {
                    break;
                }
            }

            if (maxCnt < cnt) {
                maxCnt = cnt;
            }
        }
        return res[0] + " " + res[1];
    }
}

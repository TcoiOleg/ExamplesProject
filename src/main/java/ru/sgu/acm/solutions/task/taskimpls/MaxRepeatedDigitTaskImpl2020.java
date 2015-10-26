package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 10.10.15
 */
public class MaxRepeatedDigitTaskImpl2020 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt(), prev = -1, temp, cnt = 0, maxCnt = -1111111111, dig = -11111;
        if (n == 1) {
            temp = scanner.nextInt();
            return temp + " 1";
        }
        while (n-- > 0) {
            temp = scanner.nextInt();
            if (temp == prev) {
                cnt++;
            } else {
                cnt = 1;
            }
            prev = temp;
            if (maxCnt < cnt) {
                maxCnt = cnt;
                dig = temp;
            }
        }
       return dig + " " + maxCnt;
    }
}

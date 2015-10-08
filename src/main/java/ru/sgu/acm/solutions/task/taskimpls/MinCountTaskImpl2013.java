package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 07.10.15
 */
public class MinCountTaskImpl2013 implements Task {

    @Override
    public String execute(Scanner scanner) {
        int temp, min = 10000000, n = scanner.nextInt(), cnt = 0;
        while (n-- > 0) {
            temp = scanner.nextInt();
            if (temp == min) {
                cnt++;
            }
            if (min > temp) {
                min = temp;
                cnt = 1;
            }
        }
        return String.valueOf(cnt);
    }
}

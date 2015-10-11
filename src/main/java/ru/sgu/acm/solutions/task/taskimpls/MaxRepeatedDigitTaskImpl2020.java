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
        int n = scanner.nextInt(), cnt = 1, digit = scanner.nextInt(), temp;
        while (n-- > 1) {
            temp = scanner.nextInt();
            if (temp == digit) {
                cnt++;
            } else {
                cnt = 1;
                digit = temp;
            }
        }
        return String.valueOf(digit + " " + cnt);
    }
}

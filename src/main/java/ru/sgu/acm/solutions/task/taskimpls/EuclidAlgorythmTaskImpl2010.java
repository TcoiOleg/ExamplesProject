package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 05.10.15
 */
public class EuclidAlgorythmTaskImpl2010 implements Task {

    @Override
    public String execute(Scanner scanner) {
        int cnt = 0,a = scanner.nextInt(), b = scanner.nextInt();
        while (a * b > 0) {
            int temp = a > b ? (a-= b) : (b-= a);
            cnt++;
        }
        return String.valueOf(cnt + " " + (a > b ? a : b));
    }
}

package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 12.10.15
 */
public class EuclidAlgorythmExtTaskImpl2014 implements Task {

    @Override
    public String execute(Scanner scanner) {
        int a = scanner.nextInt(), b = scanner.nextInt();
        int count = 0;
        while (b != 0) {
            count += a / b;
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return count + " " + a;
    }
}

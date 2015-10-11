package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 28.07.15
 */
public class BadenConverterTaskImpl2006 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt();
        int foot = n / 36;
        int ost = n % 36 % 3;
        int dume = n % 36 / 3;
        if (ost == 2) { dume++;}
        return foot + " " + dume;
    }
}

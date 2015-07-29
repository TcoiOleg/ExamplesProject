package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 29.07.15
 */
public class RoundNumbersBinaryTaskImpl2007 implements Task {

    @Override
    public String execute(Scanner scanner) {
        int digit = Integer.parseInt(scanner.nextLine());
        int powerOf2 = 2;
        int cnt = 0;
        while (digit % powerOf2 == 0) {
            powerOf2 <<= 1;
            cnt++;
        }
        return String.valueOf(cnt);
    }
}

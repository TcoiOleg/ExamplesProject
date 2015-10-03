package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 03.10.15
 */
public class TruckLoadTaskImpl2008 implements Task {

    @Override
    public String execute(Scanner scanner) {
        int n, w, sum = 0, freightCnt = 0;
        n = scanner.nextInt();
        w = scanner.nextInt();
        while(n-- > 0) {
            int temp = scanner.nextInt();
            if (sum + temp <= w) {
                sum += temp;
                freightCnt++;
            }
        }
        return String.valueOf(freightCnt + " " +sum);
    }
}

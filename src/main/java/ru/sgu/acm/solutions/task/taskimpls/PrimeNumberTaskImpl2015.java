package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 07.10.15
 */
public class PrimeNumberTaskImpl2015 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt(), i = 2;
        StringBuilder ans = new StringBuilder("");
        while (i++ <= n) {
            if (isPrime(i)) {
                ans.append(i).append(" ");
            }
        }
        return ans.toString();
    }

    private static boolean isPrime(int digit) {
        for (int i = 2; i <= digit / 2; i++) {
            if (digit % i == 0) {
                return false;
            }
        }
        return true;
    }
}

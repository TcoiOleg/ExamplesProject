package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 28.10.15
 */
public class Digits1_4TaskImpl2028 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt();
        StringBuilder ans = new StringBuilder("");
        int mas[] = new int[5];
        while (n-- > 0) {
            mas[scanner.nextInt()]++;
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] != 0)
                ans.append(i).append(" ").append(mas[i]);
        }
        return ans.toString();
    }
}

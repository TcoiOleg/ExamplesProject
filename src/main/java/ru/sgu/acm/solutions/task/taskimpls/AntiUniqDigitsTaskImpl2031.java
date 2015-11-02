package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 28.10.15
 */
public class AntiUniqDigitsTaskImpl2031 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt(), cnt = 0;
        StringBuilder ans = new StringBuilder("");
        int mas[] = new int[101];
        while(n-- > 0) {
            mas[scanner.nextInt()]++;
        }
        while (n++ < 100) {
            if (mas[n] > 1) {
                cnt++;
                ans.append(n).append(" ");
            }
        }
        return String.valueOf(cnt + "\n" + ans);
    }
}

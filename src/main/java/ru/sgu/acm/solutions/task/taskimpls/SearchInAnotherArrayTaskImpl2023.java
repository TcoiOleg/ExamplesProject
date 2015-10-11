package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 10.10.15
 */
public class SearchInAnotherArrayTaskImpl2023 implements Task {

    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt();
        int mas[] = new int[n], mas2[];
        while (n-- > 0) {
            mas[n] = scanner.nextInt();
        }
        n = scanner.nextInt();
        mas2 = new int[n];
        while (n-- > 0)
        {
            mas2[n] = scanner.nextInt();
        }
        n = 0;
        StringBuilder str = new StringBuilder("\n");
        for (int i = mas.length - 1; i >= 0; i--) {
            for (int j = mas2.length - 1; j >=0; j--) {
                if (mas[i] == mas2[j]) {
                    str.append(mas[i]).append(" ");
                }
            }
        }
        return String.valueOf(n) + str.toString();
    }
}

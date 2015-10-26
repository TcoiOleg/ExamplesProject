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
        int n = scanner.nextInt(), i = 0;
        int mas1[], mas2[];
        mas1 = new int[n];
        StringBuilder str = new StringBuilder("");
        while (i < n) {
            mas1[i++] = scanner.nextInt();
        }
        n = scanner.nextInt();
        mas2 = new int[n];
        i = 0;
        while (i < n) {
            mas2[i++] = scanner.nextInt();
        }
        n = 0;
        for (int j = 0; j < mas1.length; j++) {
            if (find(mas1[j], mas2)) {
                str.append(mas1[j]).append(" ");
                n++;
            }
        }
        return n + "\n" + str.toString();
    }

    public static boolean find(int target, int mas[]) {
        for (int i = 0; i < mas.length; i++) {
            if (target == mas[i]) {
                return true;
            }
        }
        return false;
    }
}

package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Arrays;
import java.util.Scanner;

/**
 * User: 1
 * Date: 02.11.15
 */

// array received by
public class ArrayPhaseTaskImpl2035 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt();
        int mas[] = new int[n],
                tempMas[],
                res[];
        for (int i = 0; i < n; i++) {
            mas[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            tempMas = new int[0];
            for (int j = i; j < n; j++) {
                tempMas = appendEl(tempMas, mas[j]);
                int s = n % tempMas.length;
                if (s == 0) {
                    s = n / tempMas.length;
                    res = new int[0];
                    while (s-- > 0) {
                        res = appendMas(res, tempMas);
                    }
                    if (Arrays.equals(res, mas)) {
                        return String.valueOf(tempMas.length);
                    }
                }
            }
        }
        return "0";
    }


    public static int[] appendEl(int mas[], int n) {
        int newMas[] = new int[mas.length + 1];
        for (int i = 0; i < mas.length; i++) {
            newMas[i] = mas[i];
        }
        newMas[mas.length] = n;
        return newMas;
    }

    public static int[] appendMas(int targetMas[], int appendMas[]) {
        int newMas[] = new int[targetMas.length + appendMas.length];
        for (int i = 0; i < targetMas.length; i++) {
            newMas[i] = targetMas[i];
        }
        for (int i = 0; i < appendMas.length; i++) {
            newMas[targetMas.length + i] = appendMas[i];
        }
        return newMas;
    }
}

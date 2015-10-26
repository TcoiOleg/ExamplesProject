package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Arrays;
import java.util.Scanner;

/**
 * User: 1
 * Date: 15.10.15
 */
public class TwoRevertsTaskImpl2027 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt();
        int mas[] = new int[n];
        while (n-- > 0) {
            mas[n] = scanner.nextInt();
        }
        revert(mas, 1, mas.length);
        while (n++ < 1) {
            int l = scanner.nextInt(), r = scanner.nextInt();
            revert(mas, l, r);
        }
        return Arrays.toString(mas).replaceAll("\\[|\\]|,", "").trim();
    }

    public static void revert(int mas[], int l, int r) {
        l--; r--;
        if (r - l < 2) {
            swap(mas, r, l);
            return;
        }
        int halfMas = (r - l) % 2 != 0 ? (r - l) / 2 + 1 : (r - l) / 2;
        for (int i = l; i < l + halfMas; i++) {
            swap(mas, i, r - (i - l));
        }
    }

    private static void swap(int mas[], int l, int r) {
        int temp = mas[l];
        mas[l] = mas[r];
        mas[r] = temp;
    }

}

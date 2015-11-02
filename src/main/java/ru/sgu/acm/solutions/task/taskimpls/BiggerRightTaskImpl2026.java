package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 13.10.15
 */
public class BiggerRightTaskImpl2026 implements Task {
    @Override
    public String execute(Scanner scanner) {
        StringBuilder ans = new StringBuilder("");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        while (n-- > 0) {
            arr[n] = scanner.nextInt();
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            ans.append(getBiggerRight(arr, i)).append("\n");
        }
        return ans.toString();
    }

    public static int getBiggerRight(int arr[], int ind) {
        int big = -10000000;
        for (int i = ind - 1; i >= 0; i--) {
            if (arr[i] > arr[ind]) {
                return arr[i];
            }
        }
        return 0;
    }


}

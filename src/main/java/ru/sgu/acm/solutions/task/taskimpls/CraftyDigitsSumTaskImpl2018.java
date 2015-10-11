package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 08.10.15
 */
public class CraftyDigitsSumTaskImpl2018 implements Task {
    @Override
    public String execute(Scanner scanner) {
     /*   int n = scanner.nextInt(), i = 0, k = 1, sum = 0, temp = 1;
        while (i < n) {
            if (i == k) {
                k++;
                temp *= -1;
            }
            sum += scanner.nextInt() * temp;
            i++;
        }
        return String.valueOf(sum);*/
        int n = scanner.nextInt(), i = 1, k = 2, d = 1, sum = 0;
        while (n-- > 0) {
            if (i-- == 0) {
                i = k++;
                d *= -1;
            }
            sum += scanner.nextInt() * d;
        }
        return String.valueOf(sum);
    }
}

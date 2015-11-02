package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 28.10.15
 */
public class BigDigitsComparationTaskImpl2033 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int dig1[], dig2[];
        StringBuilder a = new StringBuilder(""),
                b = new StringBuilder("");
        int n = scanner.nextInt();
        while (n-- > 0) {
            a.append(scanner.nextInt());
        }
        n = scanner.nextInt();
        while (n-- > 0) {
            b.append(scanner.nextInt());
        }
        if (a.length() != b.length()) {
            return String.valueOf(a.length() > b.length() ? 1 : -1);
        }
        if (a.toString().compareTo(b.toString()) != 0) {
            return String.valueOf(a.toString().compareTo(b.toString()) > 0 ? 1 : -1);
        }
        return "0";
        /*dig1 = getDigit(scanner);
        dig2 = getDigit(scanner);
        return String.valueOf(equal(dig1, dig2));*/
    }

    private static int equal(int dig1[], int dig2[]) {
        if (dig1.length != dig2.length) {
            return dig1.length > dig2.length ? 1 : -1;
        }
        for (int i = dig1.length - 1; i >= 0; i--) {
            if (dig1[i] > dig2[i]) {
                return 1;
            } else {
                if (dig1[i] < dig2[i]) {
                    return -1;
                }
            }
        }
        return 0;
    }

    private static int[] getDigit(Scanner scanner) {
        int n = scanner.nextInt();
        int[] dig1 = new int[n];
        while(n-- > 0) {
            dig1[n] = scanner.nextInt();
        }
        return dig1;
    }
}

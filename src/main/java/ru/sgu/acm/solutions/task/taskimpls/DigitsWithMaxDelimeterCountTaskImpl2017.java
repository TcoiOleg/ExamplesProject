package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * User: 1
 * Date: 08.10.15
 */
public class DigitsWithMaxDelimeterCountTaskImpl2017 implements Task {
    @Override
    public String execute(Scanner scanner) {
        int a = scanner.nextInt(), b = scanner.nextInt(), max = -1, cnt = 0;
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = a; a <= b; a++) {
            int digit = getDelimeterCount(a, i);
            if (digit == cnt) {
                ans.add(i);
            }
            if (max < digit) {
                cnt = 1;
                ans.clear();
            }
        }
        return ans.toString().replaceAll("[\\[\\]]", "");
    }

    public int getDelimeterCount(int begin, int digitForCheck) {
        int cnt = 0;
        for (int i = begin; i < digitForCheck / 2; i++) {
            if (digitForCheck % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}

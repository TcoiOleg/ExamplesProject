package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 07.10.15
 */
public class AgeAnalysisTaskImpl2011 implements Task {

    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt();
        String ans = "specialist";
        if (n < 7) {
            ans = "preschool child";
        }
        if (n >= 7 && n < 18) {
            ans = "schoolchild " + (n - 6);
        }
        if (n >= 18 && n < 22) {
            ans = "student " + (n - 17);
        }
        return ans;
    }
}

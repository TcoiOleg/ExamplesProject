package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 07.10.15
 */
public class EquationRootCountTaskImpl2016 implements Task {

    @Override
    public String execute(Scanner scanner) {
        int n = 3;
        int cba[] = new int[3];
        while (n-- > 0) {
            cba[n] = scanner.nextInt();
        }
        if (cba[2] == 0) {
            if (cba[1] == 0) {
                if (cba[0] == 0) {
                    return "-1";
                } else {return "0";}
            } else {
                return "1";
            }
        } else {
            int D = cba[1] * cba[1] - 4 * cba[2] * cba[0];
            if (D > 0) { return "2";}
            if (D == 0) { return "1";} else { return "0";}
        }
    }
}

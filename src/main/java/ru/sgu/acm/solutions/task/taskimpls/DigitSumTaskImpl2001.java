package ru.sgu.acm.solutions.task.taskimpls;

import org.springframework.stereotype.Component;
import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 16.07.15
 */
@Component("task1Bean")
public class DigitSumTaskImpl2001 implements Task {

    @Override
    public String execute(Scanner scanner) {
        String[] firstSecondDigit = scanner.nextLine().split(" ");
        int a = Integer.parseInt(firstSecondDigit[0]);
        int b = Integer.parseInt(firstSecondDigit[1]);
        return String.valueOf(a + b);
    }
}

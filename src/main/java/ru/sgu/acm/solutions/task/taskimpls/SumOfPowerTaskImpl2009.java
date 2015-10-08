package ru.sgu.acm.solutions.task.taskimpls;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.sgu.acm.solutions.task.Task;

import java.util.Scanner;

/**
 * User: 1
 * Date: 04.10.15
 */
public class SumOfPowerTaskImpl2009 implements Task {

    private static final Logger LOGGER = LogManager.getLogger(SumOfPowerTaskImpl2009.class);

    @Override
    public String execute(Scanner scanner) {
        int n = scanner.nextInt();
        int i = 1, p = 1, sum = 0, temp;
        while (n-- > 0) {
            temp = scanner.nextInt();
            if (i++ == p) {
                sum += temp;
                LOGGER.trace("power before: {}", Integer.toBinaryString(p));
                p <<= 1;
                LOGGER.trace("power after : {}", Integer.toBinaryString(p));
            }
            LOGGER.trace("power: {}", p);
        }
        return String.valueOf(sum);
    }
}

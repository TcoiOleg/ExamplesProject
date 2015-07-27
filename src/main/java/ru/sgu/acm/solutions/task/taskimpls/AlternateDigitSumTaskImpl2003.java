package ru.sgu.acm.solutions.task.taskimpls;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.sgu.acm.solutions.task.Task;

import java.util.Arrays;
import java.util.Scanner;

/**
 * User: 1
 * Date: 17.07.15
 */
public class AlternateDigitSumTaskImpl2003 implements Task {

    private static final Logger LOGGER = LogManager.getLogger(AlternateDigitSumTaskImpl2003.class);

    @Override
    public String execute() {
        final int[] index = new int[]{0};
        LOGGER.trace("input data: {}", inputData);
        return String.valueOf(Arrays.asList(inputData.get(0).split(" ")).stream().mapToInt(numberString -> {
            LOGGER.trace("parse number: {}", numberString);
            int temp = Integer.parseInt(numberString);
            if (index[0]++ % 2 != 0) {
                return -temp;
            } else {
                return temp;
            }
        }).sum());
    }

    @Override
    public void initInputData(Scanner scanner) {
        scanner.nextLine();
        inputData.add(scanner.nextLine());
    }

    /*IntStream.range(0, params.size())
            .forEach(idx ->
            query.bind(
    idx,
            params.get(idx)
            )
            )
    ;*/
}

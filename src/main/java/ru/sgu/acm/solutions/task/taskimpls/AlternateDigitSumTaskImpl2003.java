package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.Arrays;
import java.util.Scanner;

/**
 * User: 1
 * Date: 17.07.15
 */
public class AlternateDigitSumTaskImpl2003 implements Task {
    @Override
    public String execute() {
        final int[] index = new int[]{0};
        return String.valueOf(Arrays.asList(inputData.get(0).split(" ")).stream().mapToInt(numberString -> {
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

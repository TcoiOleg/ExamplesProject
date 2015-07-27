package ru.sgu.acm.solutions.task.taskimpls;

import ru.sgu.acm.solutions.task.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * User: 1
 * Date: 18.07.15
 */
public class FirstMinIndexTaskImpl2005 implements Task {
    @Override
    public String execute() {
        final List<Integer> lst = new ArrayList<>();
        final int[] min = new int[]{1000000, 0, 0}; // min, index, minIndex
        Arrays.asList(inputData.get(0).split(" ")).forEach(
                numberString -> {
                    int temp = Integer.parseInt(numberString);
                    min[1]++;
                    if (temp < min[0]) {
                        min[0] = temp;
                        min[2] = min[1];
                    }
                    lst.add(Integer.parseInt(numberString));
                }
        );
        return String.valueOf(min[2]);
    }

    @Override
    public void initInputData(Scanner scanner) {
        scanner.nextLine();
        inputData.add(scanner.nextLine());
    }
}

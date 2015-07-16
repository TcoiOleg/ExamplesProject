package ru.sgu.acm.solutions.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * User: 1
 * Date: 15.07.15
 */
public interface Task {

    List<String> inputData = new ArrayList<>();

    String execute();

    void initInputData(Scanner scanner);
}

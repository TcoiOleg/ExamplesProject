package ru.sgu.acm.solutions;

import ru.sgu.acm.solutions.task.TaskExecutor;

import java.util.Scanner;

/**
 * User: 1
 * Date: 15.07.15
 */

public class Main {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final TaskExecutor TASK_EXECUTOR = new TaskExecutor();

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println("Enter task number: ");
        String taskNumberStr;
        while (!tryParse(taskNumberStr = SCANNER.nextLine())) {
            System.out.println("It's not a number, please enter task number: ");
        }
        final int taskNumber = Integer.parseInt(taskNumberStr);
        System.out.println("Enter tasks input values: ");
        TASK_EXECUTOR.executeTaskByNumber(SCANNER, taskNumber);
    }

    public static boolean tryParse(String str) {
        try {
            int temp = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}

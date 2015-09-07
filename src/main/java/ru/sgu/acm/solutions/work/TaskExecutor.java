package ru.sgu.acm.solutions.work;

import ru.sgu.acm.solutions.TasksContext;
import ru.sgu.acm.solutions.task.Task;

import java.io.InputStream;
import java.util.Scanner;

/**
 * User: 1
 * Date: 07.09.15
 */
public class TaskExecutor {

    public String executeTask(String beanName, InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);
        Task task = (Task) TasksContext.getBean(beanName);
        return task.execute(scanner);
    }
}

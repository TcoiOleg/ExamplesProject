package ru.sgu.acm.solutions.task;

import com.google.common.base.CharMatcher;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * User: 1
 * Date: 15.07.15
 */
public class TaskExecutor {

    public Map<Integer, Class> tasksMap;

    {
        tasksMap = new HashMap<>();
        Set<Class<? extends Task>> tasks = new Reflections().getSubTypesOf(Task.class);
        tasks.forEach(taskClass -> {
             tasksMap.put(
                Integer.parseInt(CharMatcher.inRange('0', '9').retainFrom(taskClass.getName())),
                taskClass
             );
        });
    }

    public void executeTaskByNumber(Scanner scanner, int taskNumber) throws IllegalAccessException, InstantiationException {
        Task taskForExecute = (Task) tasksMap.get(taskNumber).newInstance();
        taskForExecute.initInputData(scanner);
        writeAnswer(taskForExecute.execute());
    }

    private void writeAnswer(String answer) {
        System.out.println(answer);
    }
}

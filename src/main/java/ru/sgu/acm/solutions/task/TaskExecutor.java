package ru.sgu.acm.solutions.task;

import org.reflections.Reflections;

import java.util.Map;

/**
 * User: 1
 * Date: 15.07.15
 */
public class TaskExecutor {

    private static Map<Integer, Class> tasksMap;

    {
        Reflections reflections = new Reflections();
        /*List<Class<? extends Task>> tasks = Arrays.asList(reflections.getSubTypesOf(Task.class).toArray());

        for (int taskIndex = 1; taskIndex < tasks.size(); taskIndex++) {

        }*/
    }

    public void executeTaskByNumber(int taskNumber) {

    }
}

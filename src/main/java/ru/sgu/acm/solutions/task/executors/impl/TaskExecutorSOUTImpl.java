package ru.sgu.acm.solutions.task.executors.impl;

import com.google.common.base.CharMatcher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.reflections.Reflections;
import ru.sgu.acm.solutions.task.Task;
import ru.sgu.acm.solutions.task.executors.TaskExecutor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * User: 1
 * Date: 15.07.15
 */

// context in Template: Strategy
public class TaskExecutorSOUTImpl extends TaskExecutor {

    private static final Logger LOGGER = LogManager.getLogger(TaskExecutorSOUTImpl.class);
    private Map<Integer, Class> tasksMap;

    public void fillTaskMap() {
        LOGGER.trace("IN Filling task map.");
        tasksMap = new HashMap<>();
        Set<Class<? extends Task>> tasks = new Reflections().getSubTypesOf(Task.class);
        tasks.forEach(taskClass -> {
            // todo: move filling task map to another logging appender
            LOGGER.trace("put task {} into map", taskClass.getName());
             tasksMap.put(
                Integer.parseInt(CharMatcher.inRange('0', '9').retainFrom(taskClass.getName())),
                taskClass
             );
        });
        LOGGER.trace("OUT Filling task map.");
    }

    public void executeTaskByNumber(Scanner scanner, int taskNumber) throws IllegalAccessException, InstantiationException {
        LOGGER.trace("Execute task: {}", taskNumber);
        if (tasksMap == null || tasksMap.isEmpty()) {
            LOGGER.warn("no tasks implementations");
            fillTaskMap();
        }
        Task taskForExecute = (Task) tasksMap.get(taskNumber).newInstance();
        taskForExecute.initInputData(scanner);
        System.out.println(taskForExecute.execute());
    }
}

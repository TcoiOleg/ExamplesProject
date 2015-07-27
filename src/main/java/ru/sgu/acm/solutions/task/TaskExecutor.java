package ru.sgu.acm.solutions.task;

import com.google.common.base.CharMatcher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
    private static final Logger LOGGER = LogManager.getLogger(TaskExecutor.class);

    {
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
        Task taskForExecute = (Task) tasksMap.get(taskNumber).newInstance();
        taskForExecute.initInputData(scanner);
        writeAnswer(taskForExecute.execute());
    }

    private void writeAnswer(String answer) {
        System.out.println(answer);
    }
}

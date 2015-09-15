package ru.patterns.factorymethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.sgu.acm.solutions.task.executors.TaskExecutor;

/**
 * User: 1
 * Date: 28.07.15
 */
public class FactoryMethodExample {

    private static final Logger LOGGER = LogManager.getLogger(FactoryMethodExample.class);

    public static enum TASK_EXECUTORS {
        SOUT, FILE
    }

    public static TaskExecutor initFactoryMethod(TASK_EXECUTORS taskExecutors) {
        Creator<TaskExecutor>[] creators = new Creator[]{new Creator.FileTaskExecutorCreator(), new Creator.SoutTaskExecutorCreator()};
        LOGGER.info("initFactoryMethod");
        switch (taskExecutors) {
            case SOUT: return creators[1].create();
            case FILE: return creators[0].create();
            default: return null;
        }
    }
}

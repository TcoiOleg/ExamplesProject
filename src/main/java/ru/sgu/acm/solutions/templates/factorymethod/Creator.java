package ru.sgu.acm.solutions.templates.factorymethod;

import ru.sgu.acm.solutions.task.executors.TaskExecutor;
import ru.sgu.acm.solutions.task.executors.impl.TaskExecutorSOUTImpl;
import ru.sgu.acm.solutions.task.executors.impl.TaskExecutorToFile;

/**
 * User: 1
 * Date: 28.07.15
 */
public interface Creator<TaskExecutorType extends TaskExecutor> {

    // factory method
    TaskExecutorType create();

    public class SoutTaskExecutorCreator implements Creator {
        @Override
        public TaskExecutor create() {
            return new TaskExecutorSOUTImpl();
        }
    }

    public class FileTaskExecutorCreator implements Creator {
        @Override
        public TaskExecutor create() {
            return new TaskExecutorToFile();
        }
    }
}



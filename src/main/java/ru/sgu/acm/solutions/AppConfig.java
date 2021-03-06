package ru.sgu.acm.solutions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import ru.sgu.acm.solutions.task.executors.TaskExecutor;
import ru.sgu.acm.solutions.task.executors.impl.TaskExecutorSOUTImpl;

/**
 * User: 1
 * Date: 28.07.15
 */
@Component
@ComponentScan(basePackages = "ru.sgu.acm.solutions.task.taskimpls")
public class AppConfig {

    @Bean(name = BeanConstants.taskExecutor, initMethod = "fillTaskMap")
    public TaskExecutor taskExecutor() {
        return new TaskExecutorSOUTImpl();
    }
}

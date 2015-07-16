package ru.sgu.acm.solutions.task;

import com.google.common.base.Joiner;
import org.junit.Test;

/**
 * User: 1
 * Date: 16.07.15
 */
public class TaskExecutorTest {

    @Test
    public void fillTest() {
        TaskExecutor taskExecutor = new TaskExecutor();
        String string = Joiner.on("|").withKeyValueSeparator("_").join(taskExecutor.tasksMap);
        System.out.println(string);
    }
}

package ru.sgu.acm.solutions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: 1
 * Date: 28.07.15
 */
public class TasksContext {

    private static final String APP_CONTEXT_PATH = "app/applicationContext.xml";
    private static ApplicationContext appContext =
            new ClassPathXmlApplicationContext(APP_CONTEXT_PATH);

    public static Object getBean(String beanName) {
        return appContext.getBean(beanName);
    }
}

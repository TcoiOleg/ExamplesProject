package ru.sgu.acm.solutions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: 1
 * Date: 28.07.15
 */

// adapter for ApplicationContext
public class TasksContext {

    private static final String APP_CONTEXT_PATH = "app/applicationContext.xml";
    private static ApplicationContext appContextFromXml =
            new ClassPathXmlApplicationContext(APP_CONTEXT_PATH);

    private static ApplicationContext appContextFromAppConfig =
            new AnnotationConfigApplicationContext(AppConfig.class);

    private static final Logger LOGGER = LogManager.getLogger(TasksContext.class);

    public static Object getBean(String beanName) {
        try {
            appContextFromXml.getBean(beanName);
        } catch (NoSuchBeanDefinitionException e) {
            LOGGER.info("get Bean {} from appConfig.", beanName);
            return appContextFromAppConfig.getBean(beanName);
        }

        LOGGER.info("get Bean {} from xmlConfig.", beanName);
        return appContextFromXml.getBean(beanName);
    }

    public static Object getBean(String beanName, Object ... args) {
        LOGGER.info("get Bean {} from xmlConfig with constructor agrs", beanName);
        return appContextFromXml.getBean(beanName, args);
    }
}

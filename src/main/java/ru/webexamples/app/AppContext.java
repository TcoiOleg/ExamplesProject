package ru.webexamples.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {

    private static ApplicationContext appContextFromXml =
            new ClassPathXmlApplicationContext("webapps/app/appContext.xml");

    public static <T> T getBean(String beanName) {
            return (T) appContextFromXml.getBean(beanName);
    }
}
package ru.webexamples.web;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContext {
    private static ApplicationContext appContextFromXml =
            new ClassPathXmlApplicationContext("/webContext.xml");

    public static <T> T getBean(String beanName) {
        return (T) appContextFromXml.getBean(beanName);
    }
}
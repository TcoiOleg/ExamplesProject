package ru.webexamples.web.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SerlvetContextListnenerEx implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().setAttribute("insane", "\nI am Servlet context listener");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}

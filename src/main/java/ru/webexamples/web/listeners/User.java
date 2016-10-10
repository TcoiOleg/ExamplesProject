package ru.webexamples.web.listeners;


import ru.webexamples.web.WebContext;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.util.Map;

public class User implements HttpSessionBindingListener {

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        WebContext.<Map<String, String>>getBean("loginHolderMap").put(event.getSession().getId(), event.getSession().getId());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        WebContext.<Map<String, String>>getBean("loginHolderMap").remove(event.getSession().getId());
    }
}

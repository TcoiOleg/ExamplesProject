package ru.webexamples.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

public class ArrayExampleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String txtArray = req.getParameter("txtArray");
        resp.getOutputStream().println(sort(txtArray));
        Object user = req.getSession().getAttribute("user");
        if (user == null) {
            resp.getOutputStream().println("Session currently opened between client and server, but not Logged!");
        } else {
            resp.getOutputStream().println("Session opened between client and server, User:" + user.toString());
        }
        HttpServletRequestWrapper httpServletRequestWrapper = new HttpServletRequestWrapper(req);
    }

    private String sort(String str) {
        Collection<Integer> set = new TreeSet<>();
        Arrays.asList(str.split(",")).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                set.add(Integer.parseInt(s));
            }
        });
        return Arrays.toString(set.toArray());
    }
}

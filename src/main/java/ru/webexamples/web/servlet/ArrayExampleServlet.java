package ru.webexamples.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

public class ArrayExampleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String txtArray = req.getParameter("txtArray");
        resp.getOutputStream().print(sort(txtArray));
    }

    private String sort(String str) {
        Collection<Integer> set = new HashSet<>();
        Arrays.asList(str.split(",")).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                set.add(Integer.parseInt(s));
            }
        });
        return Arrays.toString(set.toArray());
    }
}

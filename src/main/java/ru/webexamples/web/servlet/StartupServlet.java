package ru.webexamples.web.servlet;


import ru.webexamples.app.AppContext;
import ru.webexamples.app.Hello;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class StartupServlet extends HttpServlet {

    private Date date;

    @Override
    public void init() throws ServletException {
        date = new Date();
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getOutputStream().print("Servlet and server started at: " + date.toString());
        resp.getOutputStream().print(AppContext.<Hello>getBean("hah").getHaha());
        resp.getOutputStream().print("s");
    }
}

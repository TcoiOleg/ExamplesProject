package ru.webexamples.web.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendFormExampleServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException {
        performTask(req, resp);
    }
    private void performTask(HttpServletRequest req,
                             HttpServletResponse resp) {
        RequestOutput.generate(resp, req);
    }
}

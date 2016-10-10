package ru.webexamples.web.servlet.login;


import ru.webexamples.web.WebContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/viewSessions")
public class LoginViewer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getOutputStream().println(Arrays.toString(WebContext.<Map<String, String>>getBean("loginHolderMap").values().toArray()));
    }
}

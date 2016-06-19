package ru.webexamples.web.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class RequestOutput {
    public static void generate(HttpServletResponse resp,
                                HttpServletRequest req) {
        try {
            String name, value;
            resp.setContentType("text/html; charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.print("<HTML><HEAD>");
            out.print("<TITLE>Результат</TITLE>");
            out.print("</HEAD><BODY>");
            out.print("<TABLE BORDER=3>");
            Enumeration names = req.getParameterNames();
            while (names.hasMoreElements()) {
                name = (String) names.nextElement();
                value = req.getParameterValues(name)[0];
                name = new String(name.getBytes("ISO-8859-1"), "utf-8");
                value = new String(value.getBytes("ISO-8859-1"), "utf-8");
                out.print("<TR>");
                out.print("<TD>" + name + "</TD>");
                out.print("<TD>" + value + "</TD>");
                out.print("</TR>");
            }
            out.print("</TABLE></BODY></HTML>");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
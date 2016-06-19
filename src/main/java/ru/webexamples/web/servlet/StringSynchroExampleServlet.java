package ru.webexamples.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Oleg on 19.06.2016.
 */
public class StringSynchroExampleServlet extends HttpServlet {
    // синхронизируемый объект
    private StringBuffer locked = new StringBuffer();
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
            throws ServletException, IOException {
        performTask(req, res);
    }
    private void performTask(HttpServletRequest req,
                             HttpServletResponse res)
            throws ServletException, IOException {
        try {
            Writer out = res.getWriter();
            out.write(
                    "<HTML><HEAD>"
                            + "<TITLE>SynchronizationDemo</TITLE>"
                            + "</HEAD><BODY>");
            out.write(createString());
            out.write("</BODY></HTML>");
            out.flush();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(
                    "Failed to handle request: " + e);
        }
    }
    protected String createString() {
// оригинал строки
        final String SYNCHRO = "SYNCHRONIZATION";
        synchronized (locked) {
            try {
                for (int i = 0; i < SYNCHRO.length(); i++) {
                    locked.append(SYNCHRO.charAt(i));
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String result = locked.toString();
            locked.delete(0, SYNCHRO.length() - 1);
            return result;
        }
    }
}
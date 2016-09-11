package ru.webexamples.web.servlet;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SendMailExampleServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
    //объект почтовой сессии
    private Session mailSession = null;

    public void init(ServletConfig config) throws ServletException {
//mailSession = Session.getDefaultInstance(System.getProperties());final String host = "mail.smtphost";
        final String host = "mail.smtphost";
        final String port = "mail.smtpport";
//запрос параметров почтового сервера из web.xml
        String hostvalue = config.getInitParameter(host);
        String portvalue = config.getInitParameter(port);
        java.util.Properties props = new java.util.Properties();
//загрузка параметров почтового сервера в объект свойств
        props.put(host, hostvalue);
        props.put(port, portvalue);
//загрузка параметров почтового сервера в объект почтовой сессии
        mailSession = Session.getDefaultInstance(props, null);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//извлечение параметров письма из запроса
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String subject = request.getParameter("subj");
        String content = request.getParameter("body");
        if ((from == null) || (to == null) || (subject == null) || (content == null)) {
/*при отсутствии одного из параметров предлагается повторить
ввод*/
            response.sendRedirect("index.jsp");
            return;
        }
//запуск процесса отправки почты в отдельном потоке
        (new MailSender(to, from, subject, content)).start();
//формирование страницы с предложение о создании нового письма
        response.setContentType("text/html; charset=CP1251");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>");
        out.println("SendMail Application</title></head>");
        out.println("Message to <b>" + to
                + "</b> sending in progress");
        out.println("<a href = \"index.jsp\">New message</a>");
        out.println("</body></html>");
    }

    private class MailSender extends Thread {
        private String mailTo;
        private String mailFrom;
        private String mailSubject;
        private String mailContent;

        MailSender(String mailTo, String mailFrom, String mailSubject, String mailContent) {
            setDaemon(true);
            this.mailTo = mailTo;
            this.mailFrom = mailFrom;
            this.mailSubject = mailSubject;
            this.mailContent = mailContent;
        }

        public void run() {
            try {
//создание объекта почтового сообщения
                Message message = new MimeMessage(mailSession);
//загрузка параметров в объект почтового сообщения
                message.setFrom(new InternetAddress(mailFrom));
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(mailTo));
                message.setSubject(mailSubject);
                message.setContent(mailContent, "text/plain");
//отправка почтового сообщения
                Transport.send(message);
            } catch (AddressException e) {
                e.printStackTrace();
                System.err.print("Ошибка адреса");
            } catch (MessagingException e) {
                e.printStackTrace();
                System.out.print("Ошибка сообщения");
            }
        }
    }
}
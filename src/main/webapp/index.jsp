<%@ page language="java" contentType="text/html; charset=ISO-8859-5"
         pageEncoding="ISO-8859-5"%>
<html><body>
<jsp:useBean id="gc" class="java.util.GregorianCalendar"/>
<jsp:getProperty name="gc" property="time"/>
<FORM action="serv" method="POST"><INPUT type="submit" value="Exec hello world Servlet">
</FORM>
<ul class="list">
    <li class="list__item">
        <a href="example.jsp">Send form page</a>
    </li>
    <li class="list__item">
        <a href="synchroexample">Synchro example</a>
    </li>
    <li class="list__item">
        <a href="sendmail.jsp">Send mail page</a>
    </li>
    <%= JspUtils.createServletExampleListItem("arrayExample.jsp", I18nResolver.getLocalizedResource(ResourcesHolder.ARRAY_SERVLET_NAME_RESOURCE_ID)) %>
    <%= JspUtils.createServletExampleListItem("jstlexamples/page.jspx", "JSTL examples page") %>
    <%= JspUtils.createServletExampleListItem("redirectforward/forwardFrom.jspx", "FORWARD page") %>
    <%= JspUtils.createServletExampleListItem("redirectforward/redirect.jsp", "REFIRECT page") %>
    <%= JspUtils.createServletExampleListItem("/login.html", "Login page") %>
    <%= JspUtils.createServletExampleListItem("/createUser", "create user ex") %>
</ul>
<%@ page import="ru.webexamples.web.utils.JspUtils, ru.webexamples.app.i18n.I18nResolver" %>
<%@ page import="ru.webexamples.app.i18n.resources.ResourcesHolder" %>
<%@ taglib prefix="ex" uri="http://jsp/oltctags" %>
<ex:Hello>
    fdfs
</ex:Hello>
</body></html>
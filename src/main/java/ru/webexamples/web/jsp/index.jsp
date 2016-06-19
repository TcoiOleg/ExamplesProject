<%@ page language="java" contentType="text/html; charset=ISO-8859-5"
         pageEncoding="ISO-8859-5"%>
<html><body>
<jsp:useBean id="gc" class="java.util.GregorianCalendar"/>
<jsp:getProperty name="gc" property="time"/>
<FORM action="serv" method="POST"><INPUT type="submit" value="Exec hello world Servlet">
</FORM>
<ul class="list">
    <li class="list__item">
        <a href="example.jsp">Send form example</a>
    </li>
    <li class="list__item">
        <a href="synchroexample">Synchro form example</a>
    </li>
</ul>
</body></html>
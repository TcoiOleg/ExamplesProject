<%@ page language="java" contentType=
        "text/html; charset=utf-8" pageEncoding="utf-8"%>
<html><body>
<FORM action="sendForm" method=POST>
    <H3>Название проекта:
        <INPUT type="text" name="Имя проекта" value="-задать!-">
        Технологии:
        <TABLE BORDER=5> <tr>
            <td>JSPX</td><td><INPUT type="radio"
                                    name="Технология"
                                    value="JSP в формате XML"></td>
            <td>JSTL</td><td><INPUT type="radio"name="Технология"
                                    value="Библиотека тегов JSTL"></td>
        </tr></TABLE>
        Язык программирования:
        <TABLE BORDER=5> <tr>
            <td>Java 6<INPUT type="radio"
                             name="Язык"
                             value="Java SE 6"></td>
            <td>Java 5<INPUT type="radio"
                             name="Язык"
                             value="Java 1.5.0" checked></td>
        </tr></TABLE></H3>
    <INPUT type="submit" value="Принять"> <BR>
</FORM>
</body></html>
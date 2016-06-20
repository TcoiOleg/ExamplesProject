<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html><head><title>SendMail Application</title></head>
<b>Мой почтовый сервер</b>
<form method="post" action="sendmail">
    <table>
        <tr><td><b>To(email):</b></td><td>
            <input name="to" type="text" size=40></td></tr>
        <tr><td><b>From(email):</b></td><td>
            <input name="from" type="text" size=40></td></tr>
        <tr><td><b>Subject:</b></td><td>
            <input name="subj" type="text" size=40></td></tr>
    </table>
    <hr>
<textarea name="body" type="text" rows=5 cols=45>
Добрый день!</textarea>
    <br>
    <input type="submit" value="Отправить!">
</form>
</body></html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html><head><title>HAHAHA</title></head>
<body>
<label id="output"></label>
<form action=<%= Constants.URI_ARRAY %>
    <label id="lblName">Enter array. Split array elements by comma</label>
    <input type="text" name="txtArray" value="">
    <input type="submit" value="Принять"> <BR>
</form>
<%@ page import="ru.webexamples.web.jsp.utils.JspUtils.Constants" %>
</body></html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html><head><title>HAHAHA</title></head>
<body>
<label id="output"></label>
<form action=<%= Constants.URI_REQ_EX %>
    <input type="submit" value="Принять"> <BR>
</form>
<script type="text/javascript" src="http://scriptjava.net/source/scriptjava/scriptjava.js">
    function callServlet() {
        $.ajax({
            type: "POST",
            url: "/AjaxServletCalculator",
            data: {jsonData: JSON.stringify("{\"id\":\"4123\"}")},
            dataType: "json",

            //if received a response from the server
            success: function (data) {
                //our country code was correct so we have some information to display

                var json = JSON.parse(data);
                alert(json["resultText"]);
                /*document.getElementById('number1').value = data.*/
            }
        });
    }
</script>
<%@ page import="ru.webexamples.web.utils.JspUtils.Constants" %>
</body></html>
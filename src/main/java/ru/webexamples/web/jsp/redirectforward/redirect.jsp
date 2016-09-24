<html>
<head>
    <title>Page Redirection</title>
</head>
<body>
<center>
    <h1>Page Redirection</h1>
</center>
<%
    // New location to be redirected
    String site = new String("http://www.tutorialspoint.com/jsp/jsp_page_redirect.htm");
    response.setStatus(response.SC_MOVED_TEMPORARILY);
    response.setHeader("Location", site);
%>
</body>
</html>
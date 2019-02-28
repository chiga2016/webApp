<%--
  Created by IntelliJ IDEA.
  User: BalagutdinovIF
  Date: 28.02.2019
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logout</title>
</head>
<body>
<%
request.getSession().setAttribute("username", null);
response.sendRedirect("index.jsp");
%>
</body>
</html>

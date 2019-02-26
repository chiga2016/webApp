<%@ page import="practice1.Message" %>
<%@ page import="practice1.MessageService" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27.02.2019
  Time: 0:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    MessageService svc = (MessageService) application.getAttribute("msgSvc");
    List<Message> messages =  svc.getAllMessages();
%>
<ul>
    <c:forEach var="m" items="${messages}" >
        <li>${m}</li>
    </c:forEach>
</ul>

</body>
</html>

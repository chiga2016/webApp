<%@ page import="practice1.MessageService" %>
<%@ page import="practice1.Message" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 26.02.2019
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Лог сообщений с JSP Страницы </h1>
<ul>
<%
    MessageService svc = (MessageService) application.getAttribute("msgSvc");
    List<Message> messages =  svc.getAllMessages();
    for (Message m: messages) {
%>
<li><%=m%></li>
<%     }%>


    <jsp:include page="addMessage.jsp" />

</ul>
</body>
</html>

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
    <title>messages</title>
</head>
<body>

<!-- <h1> Мы на JSTL </h1> -->
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="addMessage.jsp" />

<ul>
    <c:forEach var="m" items="${messages}" >
        <li><font color = green><c:out value="${m.date}"></c:out></font> : From  <a href="add.do?author=${m.author}"><font color = blue><c:out value="${m.author}"></c:out> </font></a> To <font color = purple><c:out value="${m.recepient}"></c:out></font> : <font color = #4b0082  size="3" face="Arial" ><c:out value="${m.text}"></c:out></font>   </li>
    </c:forEach>
</ul>




</body>
</html>

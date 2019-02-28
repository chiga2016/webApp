<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27.02.2019
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
--------------------------------------------------------------------
<%@ page pageEncoding="UTF-8" %>
<form action="/login.do" method="POST">
    <input type="text" placeholder="имя" name="login" />
    <input type="password" placeholder="пароль" name="pass"/>
    <input type="submit" value="Вход"/>
</form>

--------------------------------------------------------------------
</body>
</html>

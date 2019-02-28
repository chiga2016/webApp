<%@ page import="java.io.PrintWriter" %><%--
    Document   : index
    Created on : 06.12.2010, 23:24:53
    Author     : Alexei
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page newMessage</title>
    </head>
    <body>
    <%
       // String login = (String) request.getSession().getAttribute("username");
       // PrintWriter pw = response.getWriter();
       // pw.println(login);
    %>

    <h1>Добро пожаловать  <font color="#4b0082">${username}</font> !!!!!</h1>

    <h3>Пользователь <c:if test="${username!=null}"> <font color="#4b0082">${username}</font> <a href="logout.jsp">(выйти)</a> </c:if>  <c:if test="${username==null}"> <font color="#4b0082">Аноним</font> <a href="index.jsp">(войти)</a> </c:if> !!!!!</h3>

        <h3>Добавить сообщение</h3>
        <form action="/add.do" method="POST" accept-charset="UTF-8">
        Ваше имя:<br/>
        <input name="user" <c:if test="${username!=null}"> value=${username}</c:if>  /><br/>
        Кому:<br/>
        <input name="user2"/><br/>
        Ваше сообщение:<br/>
        <textarea cols="50" rows="3"  name="msg"></textarea><br/>
        <input type="submit" title="Опубликовать"/>
    </form>

       


</body>
</html>

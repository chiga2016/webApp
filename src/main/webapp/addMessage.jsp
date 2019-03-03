<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.io.PrintWriter" %><%--
    Document   : index
    Created on : 06.12.2010, 23:24:53
    Author     : Alexei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page addMessage</title>
    </head>
    <body>
    <% //String login = (String) request.getSession().getAttribute("username");   //PrintWriter pw = response.getWriter();     //pw.println(login);  %>

    <div style="margin-right: 10px"><h2>Пользователь <c:if test="${username!=null}"> <font
            color="#4b0082">${username}</font> <a href="logout.jsp">(выйти)</a></c:if> <c:if test="${username==null}">
        <font color="#4b0082">Аноним</font> <a href="index.jsp">(войти)</a> </c:if> !!!!!</h2></div>
    <br>
    <form action="/view.do" method="post" style="float:left; margin-right: 10px">
        <input type="submit" title="Показать сообщения" name="viewMessages" value="Показать сообщения"></input>
    </form>

    <form action="/viewPrivate.do" method="post"  style="float:left; margin-right: 10px">
        <input type="submit" title="Показать личные сообщения" name="viewPrivateMessages" value="Показать личные сообщения"></input>
    </form>
    <br>
        <h3>Добавить сообщение</h3>
        <form action="/add.do" method="POST" accept-charset="UTF-8">
        Ваше имя:<br/>
        <input name="user"  <c:if test="${username!=null}"> value=${username}</c:if> /><br/>
        Кому:<br/>
        <input name="user2" value="${author}"  /><br/>
        Ваше сообщение:<br/>
        <textarea cols="50" rows="3"  name="msg"></textarea><br/>
        <input type="submit" title="Опубликовать"/>
    </form>

       


	   </body>
</html>

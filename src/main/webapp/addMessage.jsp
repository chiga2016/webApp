<%-- 
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
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Добавить сообщение</h3>
        <form action="/add.do" method="POST" accept-charset="UTF-8">
        Ваше имя:<br/>
        <input name="user"/><br/>
        Кому:<br/>
        <input name="user2"/><br/>
        Ваше сообщение:<br/>
        <textarea cols="50" rows="3"  name="msg"></textarea><br/>
        <input type="submit" title="Опубликовать"/>
    </form>

       


	   </body>
</html>

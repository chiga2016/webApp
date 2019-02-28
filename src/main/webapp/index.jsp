<%--suppress XmlPathReference --%>
<%--
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
        <title>Чат</title>
    </head>
    <body>
    <div style="
    margin: 0;padding: 0;
    margin-left: 40%;
     margin-right: 30%;
	 font-size: medium;
	 margin-top: 10%;" >
        <%
        //String login = (String) request.getSession().getAttribute("username");
        %>

        <h1>Добро пожаловать <c:if test="${username!=null}"> <font color="#4b0082">${username}   </font> <a href="logout.jsp">(выйти)</a> </c:if> !!!!!</h1>

        <jsp:include page="login.jsp" />
        <br/> <br/>
        <c:if test="${username==null}">
        <a href="addMessage.jsp"><font size="+3" color="#008b8b"> Начать чат анонимно </font> </a>
        </c:if>




        
        
        
    </div>>

        </body>
</html>

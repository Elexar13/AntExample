<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11/5/20
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Primitive page</title>
    <style>
        body{
            align-items: center;
            text-align: center;
        }
    </style>
</head>
<body>
    <jsp:useBean id = "date" class = "java.util.Date" />
    <jsp:useBean id = "userBean" class = "com.company.beans.UserBean" scope="session"/>
    <h1>Hello <%=userBean.getUsername()%></h1>
    <p>Current time is <%= date.getHours() %>:<%= date.getMinutes() %>:<%= date.getSeconds() %></p>
    <h3>Enter your name</h3>
    <form method="get" action="/hello/servlet">
        <input type="text" name="name"> <br><br>
        <input type="submit" name="submit" value="Input">
    </form>
</body>
</html>

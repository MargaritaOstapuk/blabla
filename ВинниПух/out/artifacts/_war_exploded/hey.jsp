<%--
  Created by IntelliJ IDEA.
  User: Маргарита
  Date: 29.12.2015
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
  <title>Margarita_Ostapuk</title>
  <link rel="stylesheet" TYPE="text/css" href="myStyles.css">
</head>

<body>

<form action="LogIn" method="get">
  <h2>Добро пожаловать <%= request.getAttribute("surname")%> <%= request.getAttribute("name_client")%> :D</h2>
</form>

</body>

</html>

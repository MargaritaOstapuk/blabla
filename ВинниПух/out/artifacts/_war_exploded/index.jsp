<%--
  Created by IntelliJ IDEA.
  User: Маргарита
  Date: 27.12.2015
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

  <head>
    <title>Margarita_Ostapuk</title>
    <link rel="stylesheet" TYPE="text/css" href="myStyles.css">
  </head>

  <body>

  <form action="LogIn" metod="get">
   <h1>login: </h1>
        <input type="text" name="login" value="" class="my_edit">
    <h1>Password:</h1>
        <input tclass="mg2" type="password" name="password" value="" class="my_edit">
    <br><br>
    <button type="submit" id="submit1" class="my_button">Вход</button>
  </form>

  <form class="Registration" action="Registration.jsp">
      <button type="submit" id="submit2" class="my_button" >Регистрация</button>
  </form>

  </body>

</html>

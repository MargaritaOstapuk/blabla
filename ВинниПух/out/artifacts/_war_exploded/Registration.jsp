<%--
  Created by IntelliJ IDEA.
  User: Маргарита
  Date: 28.12.2015
  Time: 23:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
  <title>Регистрация</title>
  <link rel="stylesheet" TYPE="text/css" href="myStyles.css">
</head>

<body>

<form action="Registration" method="get">
  <h1>Фамилия: </h1>
    <input type="text"  name="surname" value="" class="my_edit">
  <h1>Имя: </h1>
    <input type="text" name="name" value="" class="my_edit">
  <h1>Пол: </h1>
    <input type="text" name="sex" value="" class="my_edit">
  <h1>Логин: </h1>
    <input type="text" name="log" value="" class="my_edit">
  <h1>Пароль: </h1>
    <input type="text" name="pas" value="" class="my_edit">
  <br><br>
  <button type="submit" id="sub1" class="my_button">Сохранить</button>
</form>

<form action="index.jsp">
 <button type="submit" id="sub2" class="my_button">Отмена</button>
</form>

</body>

</html>

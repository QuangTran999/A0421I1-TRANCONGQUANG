<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/12/2021
  Time: 11:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Choose condiment</h1>
<form action="/choose" method="post">
    <div style="display: inline">
        <input  type="checkbox" name="condiment" value="Lettuce">Lettuce
        <input  type="checkbox" name="condiment" value="Tomato">Tomato
        <input  type="checkbox" name="condiment" value="Mustard">Mustard
        <input  type="checkbox" name="condiment" value="Sprouts">Sprouts
        <input type="submit" value="Save">
    </div>
</form>
</body>
</html>

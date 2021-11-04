<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/10/2021
  Time: 9:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Dictionary</title>
  </head>
  <body>
  <h2>Vietnamese Dictionary</h2>
  <form action="/translate" method="post">
    <input type="text" name="txtSearch" placeholder="Enter your word: "/>
    <input type = "submit" value = "Search"/>
  </form>
  </body>
</html>

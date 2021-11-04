<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/10/2021
  Time: 9:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="/convert" method="post">
      <div style="border: darkgreen">
        <h2>Currency Converter</h2>
        <label>Rate:</label><br/>
        <input type="text" name="rate" value="22000"><br/>
        <label>USD:</label><br/>
        <input type="text" name="usd" value="1"><br/>
        <input type="submit" value="Converter">
      </div>
    </form>
  </body>
</html>

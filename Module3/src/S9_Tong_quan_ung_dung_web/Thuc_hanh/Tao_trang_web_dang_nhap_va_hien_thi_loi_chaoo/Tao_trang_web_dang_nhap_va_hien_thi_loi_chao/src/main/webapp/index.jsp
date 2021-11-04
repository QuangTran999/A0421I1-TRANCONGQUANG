<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/10/2021
  Time: 10:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <style type="text/css">
      .login {
        height:180px; width:230px;
        margin:0;
        padding:10px;
        border:1px #CCC solid;
      }
      .login input {
        padding:5px; margin:5px
      }
    </style>
    <title>$Title$</title>
  </head>
  <body>
    <form method="get" action="/login">
      <div class="login">
        <h2>Login</h2>
        <input type="text" size="25px" name="username" placeholder="User">
        <input type="text" size="25px" name="password" placeholder="password">
        <input type="submit" value="Sign in">
      </div>
    </form>
  </body>
</html>

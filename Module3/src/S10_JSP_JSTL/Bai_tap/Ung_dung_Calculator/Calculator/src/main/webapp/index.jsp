<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/10/2021
  Time: 8:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <h1>Simple Calculator</h1>
      <form action="/calculator" method="post">
        <div>
          First Operand: <input type="text" name="first-operand" value="321">
        </div>
        <div>
          Operator:
          <select name="operator">
            <option>+</option>
            <option>-</option>
            <option>*</option>
            <option>/</option>
          </select>
        </div>
        <div>
          Second Operand: <input type="text" name="second-operand" value="21">
        </div>
        <div>
          <input type="submit" value="Calculator">
        </div>
      </form>
  </body>
</html>

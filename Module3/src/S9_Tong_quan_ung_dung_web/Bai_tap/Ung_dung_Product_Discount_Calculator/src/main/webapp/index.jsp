<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/10/2021
  Time: 10:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
    <form action="/convert" method="post">
      <div>
        <h2>Product Discount Calculator</h2>
        <input type="text" name="description" placeholder="Product Description"><br/><br/>
        <input type="text" name="price" placeholder="List Price"><br/><br/>
        <input type="text" name="discount" placeholder="Discount Percent"><br/><br/>
        <input type="submit" value="Convert"><br/>
      </div>
    </form>
  </body>
</html>

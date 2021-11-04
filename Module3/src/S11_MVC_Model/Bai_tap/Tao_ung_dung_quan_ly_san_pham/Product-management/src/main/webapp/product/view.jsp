<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/11/2021
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<a href="/products">Back to list Product.</a>
<form method="post">
    <div style="border: black 1px solid;width: 200px">
        <div style="margin: 10px 10px 10px 10px">
            <div>
                Name: <input type="text" name="name" value="${view.name}">
            </div>
            <div>
                Price: <input type="text" name="price" value="${view.price}">
            </div>
            <div>
                Descripton: <input type="text" name="description" value="${view.description}">
            </div>
            <div>
                Supplier: <input type="text" name="supplier" value="${view.supplier}">
            </div>
        </div>
    </div>
</form>
</body>
</html>

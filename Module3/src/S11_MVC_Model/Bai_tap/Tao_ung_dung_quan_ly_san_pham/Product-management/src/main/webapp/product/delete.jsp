<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/11/2021
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detele Product</title>
</head>
<body>
<h2>Edit Product</h2>
<a href="/products">Back to list Producrs.</a>
<div>
    <c:if test="${message != null}">
        <p>${message}</p>
    </c:if>
</div>
<form method="post">
    <div style="border: black 1px solid;width: 200px">
        <div style="margin: 10px 10px 10px 10px">
            <div>
                Name: <input type="text" name="name" value="${delete.name}">
            </div>
            <div>
                Price: <input type="text" name="price" value="${delete.price}">
            </div>
            <div>
                Descripton: <input type="text" name="description" value="${delete.description}">
            </div>
            <div>
                Supplier: <input type="text" name="supplier" value="${delete.supplier}">
            </div>
            <div>
                <input type="submit" value="Delete">
            </div>
        </div>
    </div>
</form>

</body>
</html>

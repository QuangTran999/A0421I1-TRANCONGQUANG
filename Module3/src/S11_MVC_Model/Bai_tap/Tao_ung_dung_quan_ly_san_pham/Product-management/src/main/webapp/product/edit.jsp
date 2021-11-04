<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/11/2021
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
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
                    Name: <input type="text" name="name" value="${edit.name}">
                </div>
                <div>
                    Price: <input type="text" name="price" value="${edit.price}">
                </div>
                <div>
                    Descripton: <input type="text" name="description" value="${edit.description}">
                </div>
                <div>
                    Supplier: <input type="text" name="supplier" value="${edit.supplier}">
                </div>
                <div>
                    <input type="submit" value="Edit">
                </div>
            </div>
        </div>
    </form>
</body>
</html>

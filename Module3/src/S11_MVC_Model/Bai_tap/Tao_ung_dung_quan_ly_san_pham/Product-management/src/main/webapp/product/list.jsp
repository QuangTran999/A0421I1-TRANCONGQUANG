<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/11/2021
  Time: 12:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<a href="/products?action=create">Create new product</a>
    <form>
        <table border="1">
            <tr>
                <td>Name</td>
                <td>Price</td>
                <td>Description</td>
                <td>Supplier</td>
                <td>Edit</td>
                <td>Delete</td>
            </tr>
            <c:forEach items='${products}' var="product">
                <tr>
                    <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
                    <td>${product.getPrice()}</td>
                    <td>${product.getDescription()}</td>
                    <td>${product.getSupplier()}</td>
                    <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
                    <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26/10/2021
  Time: 8:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    <title>Danh sách khách hàng</title>
    <link rel="stylesheet" href="/webapp/bootstrap-4.6.0-dist/css/bootstrap.css">
</head>
<body>
<h2 style="text-align: center">Danh sách khách hàng</h2>
<table class="table table-hover">
    <tr >
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Hình ảnh</th>
    </tr>
    <c:forEach items="${list}" var="customer"> // foreach(Customer customer: listCustomer)
        <tr >
            <td>${customer.name}</td>
            <td>${customer.date}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.img} "height="50px" width="50px"></td>
        </tr>
    </c:forEach>

</table>

</body>
</html>

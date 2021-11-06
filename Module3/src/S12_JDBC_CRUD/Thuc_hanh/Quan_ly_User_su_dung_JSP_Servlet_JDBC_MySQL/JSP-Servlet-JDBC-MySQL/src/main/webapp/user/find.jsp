<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/11/2021
  Time: 4:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<div style="border: black 1px solid">
    <h2>Find user: </h2>
    <form method="post">
        <input type="text" name="find" placeholder="Nhâp quốc gia bạn cần tìm kiếm">
        <input type="submit" value="Tìm kiếm ">
    </form>
</div>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.email}"/></td>
                <td><c:out value="${user.country}"/></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

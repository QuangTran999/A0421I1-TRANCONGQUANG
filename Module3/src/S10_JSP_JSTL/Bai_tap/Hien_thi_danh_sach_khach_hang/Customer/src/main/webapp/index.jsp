<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26/10/2021
  Time: 8:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <h2>Danh sách khách hàng</h2>
    <table>
      <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Hình ảnh</th>
      </tr>
      <c:forEach items="${list}" var="customer">
        <tr>
          <td>${customer.name}</td>
          <td>${customer.date}</td>
          <td>${customer.address}</td>
          <td>${customer.img}</td>
        </tr>
      </c:forEach>


    </table>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/11/2021
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Create New Product</h2>
    <a href="/products">Back to list.</a>
    <div>
        <c:if test='${message != null}'>
            <span>${message}</span>
        </c:if>
    </div>
    <form action="" method="post">
        <div style="border: 1px black solid; width: 200px">
            <div style="margin: 10px 10px 10px 10px">
                <div>
                    </br>Name:        <input type="text" name="name">
                </div>
                <div>
                    </br>Price:       <input type="text" name="price">
                </div>
                <div>
                    </br>Description: <input type="text" name="description">
                </div>
                <div>
                    </br>Supplier:    <input type="text" name="supplier">
                </div>
                </br><input type="submit" value="ADD">
            </div>
            </div>
        </div>
    </form>
</body>
</html>

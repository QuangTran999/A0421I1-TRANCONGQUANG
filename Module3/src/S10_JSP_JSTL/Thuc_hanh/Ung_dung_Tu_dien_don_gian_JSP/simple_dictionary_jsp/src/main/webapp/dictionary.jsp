<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26/10/2021
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%!
        Map<String, String> dic = new HashMap<>();
    %>
    <%
        dic.put("hello", "xin chao");
        dic.put("how", "the nao");
        dic.put("book", "sach");
        dic.put("computer", "may tinh");

        String search = request.getParameter("search");

        String result = dic.get(search);
        if (result != null){
            System.out.println("Word: "+search);
            System.out.println("Result: "+result);
        }else {
            System.out.println("Not Found");
        }
    %>

</body>
</html>

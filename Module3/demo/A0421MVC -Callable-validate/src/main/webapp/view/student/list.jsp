<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/29/2021
  Time: 2:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/jquery/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" href="/bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <script src="/bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
    <script src="/bootstrap-4.6.0-dist/js/bootstrap.bundle.min.js"></script>
<%--    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">--%>
<%--    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>--%>
<%--    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>--%>
</head>
<body>
<h1>List Student</h1>

<a href="student?action=add"> Add</a>

<c:if test="${mess!=null}">
    <strong style="color: red">${mess}</strong>
</c:if>
<table  class="table table-active">
    <tr>
        <th>STT</th>
        <th>ID</th>
        <th>Name</th>
        <th>Birthday</th>
        <th>Class ID</th>
        <th>Point</th>
        <th>gender</th>
        <th>Email</th>
        <th>Edit</th>
    </tr>
    <c:forEach items="${studentList}" var="student" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.birthday}</td>
            <td>${student.classId}</td>
            <td>${student.point}</td>
            <td>
                <c:if test="${student.gender}">
                    <sp>Male</sp>
                </c:if>
                <c:if test="${!student.gender}">
                    <sp>Female</sp>
                </c:if>
            </td>
            <td>${student.email}</td>
            <td><a href="/student?action=edit&id=${student.id}">Edit</a></td>
            <td>
                <button type="button"  class="btn btn-danger" onclick="duaDuLieuLenModal('${student.id}','${student.name}')"
                        data-toggle="modal" data-target="#exampleModal">
                Delete
            </button>
            </td>
        </tr>
    </c:forEach>

</table>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="/student?action=delete" method="post">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Hộp thoại xác nhận xóa</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <input id="idStudent" hidden name="id">
                    <span>Bạn có muốn xóa sinh viên </span>
                    <span id="nameStudent" >Nam Student </span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">OK</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script>
function duaDuLieuLenModal(id,name) {
    document.getElementById("nameStudent").innerText =name;
    document.getElementById("idStudent").value =id;
}
</script>
</body>
</html>

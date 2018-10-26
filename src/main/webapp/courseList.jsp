<%@ page language="java" contentType="text/html;charset=utf-8" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="zh_CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>学生信息</title>
    <link rel="stylesheet" href="lib/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="lib/2.2.4/jquery-2.2.4.min.js"></script>
    <script src="lib/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="page-header">
            <h1>学生信息管理系统<a class="btn btn-primary pull-right" href="${pageContext.request.contextPath}/addStudent.jsp" role="button">新增用户</a></h1>
        </div>
    </div>
    <div class="row">
        <table class="table table-striped table-bordered">
            <tr>
                <th>编号</th>
                <th>学号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年龄</th>
                <th>年级</th>
                <th>专业</th>
                <th>操作</th>
            </tr>
            <c:forEach var="student" items="${requestScope.list}">
            <tr>
                <td>${student.id}</td>
                <td>${student.regNo}</td>
                <td>${student.name}</td>
                <td>${student.sex}</td>
                <td>${student.age}</td>
                <td>${student.grade}</td>
                <td>${student.major}</td>
                <td>
                    <div class="btn-group btn-group-xs" role="group" aria-label="...">
                        <a class="btn btn-primary" href="${pageContext.request.contextPath}/showStudent?id=${student.id}&type=show" role="button">查看</a>
                        <a class="btn btn-primary" href="${pageContext.request.contextPath}/showStudent?id=${student.id}" role="button">修改</a>
                        <a class="btn btn-primary" href="${pageContext.request.contextPath}/deleteStudent?id=${student.id}" role="button">删除</a>
                        <a class="btn btn-primary" href="${pageContext.request.contextPath}/showCourse" role="button">查看课程</a>
                    </div>
                </td>
            </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
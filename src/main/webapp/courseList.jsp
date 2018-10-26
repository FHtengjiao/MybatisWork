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
            <h1>学生信息管理系统<small>${student.name}的课程</small></h1>
        </div>
    </div>
    <div class="row">
        <table class="table table-striped table-bordered">
            <tr>
                <th>编号</th>
                <th>课程编号</th>
                <th>专业名称</th>
                <th>课程名称</th>
                <th>课程时长</th>
                <th>讲授教师</th>
            </tr>
            <c:forEach var="course" items="${student.courses}">
            <tr>
                <td>${course.id}</td>
                <td>${course.courseId}</td>
                <td>${course.majorName}</td>
                <td>${course.courseName}</td>
                <td>${course.courseTime}</td>
                <td>${course.courseTeacher}</td>
            </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
<%@ page import="com.xtj.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/25
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>新增学生</title>
    <link rel="stylesheet" href="lib/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="lib/2.2.4/jquery-2.2.4.min.js"></script>
    <script src="lib/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="page-header">
            <h1>学生信息管理系统<small>修改学生</small></h1>
        </div>
    </div>
    <div class="row">
        <form class="form-horizontal" action="${pageContext.request.contextPath}/updateStudent" method="post">
            <input type="hidden" name="id" value="${student.id}">
            <div class="form-group">
                <label for="regNo" class="col-sm-2 control-label">学号</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="regNo" name="regNo" value="${student.regNo}" placeholder="请输入学号">
                </div>
            </div>
            <div class="form-group">
                <label for="name" class="col-sm-2 control-label">姓名</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="name" name="name" value="${student.name}" placeholder="请输入姓名">
                </div>
            </div>
            <div class="form-group">
                <label for="sex" class="col-sm-2 control-label">性别</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="sex" name="sex" value="${student.sex}" placeholder="请输入性别">
                </div>
            </div>
            <div class="form-group">
                <label for="age" class="col-sm-2 control-label">年龄</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="age" name="age" value="${student.age}" placeholder="请输入年龄">
                </div>
            </div>
            <div class="form-group">
                <label for="grade" class="col-sm-2 control-label">年级</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="grade" name="grade" value="${student.grade}" placeholder="请输入年级">
                </div>
            </div>
            <div class="form-group">
                <label for="major" class="col-sm-2 control-label">专业</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="major" name="major" value="${student.major}" placeholder="请输入专业">
                </div>
            </div>
            <div class="form-group">
                <div class="col-dm-2">
                    <input class="btn btn-primary col-md-2 col-md-offset-4" type="submit" value="提交">
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>

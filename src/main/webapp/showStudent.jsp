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
            <h1>学生信息管理系统<small>查看学生</small></h1>
        </div>
    </div>
    <div class="row">
        <form class="form-horizontal">
            <div class="form-group">
                <label class="col-sm-2 control-label">编号</label>
                <div class="col-sm-6">
                    <p class="form-control-static">${student.id}</p>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">学号</label>
                <div class="col-sm-6">
                    <p class="form-control-static">${student.regNo}</p>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">姓名</label>
                <div class="col-sm-6">
                    <p class="form-control-static">${student.name}</p>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">性别</label>
                <div class="col-sm-6">
                    <p class="form-control-static">${student.sex}</p>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">年龄</label>
                <div class="col-sm-6">
                    <p class="form-control-static">${student.age}</p>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">年级</label>
                <div class="col-sm-6">
                    <p class="form-control-static">${student.grade}</p>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">专业</label>
                <div class="col-sm-6">
                    <p class="form-control-static">${student.major}</p>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>

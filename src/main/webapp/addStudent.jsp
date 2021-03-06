<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/25
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
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
            <h1>学生信息管理系统<small>新增学生</small></h1>
        </div>
    </div>
    <div class="row">
        <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/addStudent">
            <div class="form-group">
                <label for="regNo" class="col-sm-2 control-label">学号</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="regNo" name="regNo" placeholder="请输入学号">
                </div>
            </div>
            <div class="form-group">
                <label for="name" class="col-sm-2 control-label">姓名</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
                </div>
            </div>
            <div class="form-group">
                <label for="sex" class="col-sm-2 control-label">性别</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="sex" name="sex" placeholder="请输入性别">
                </div>
            </div>
            <div class="form-group">
                <label for="age" class="col-sm-2 control-label">年龄</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="age" name="age" placeholder="请输入年龄">
                </div>
            </div>
            <div class="form-group">
                <label for="grade" class="col-sm-2 control-label">年级</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="grade" name="grade" placeholder="请输入年级">
                </div>
            </div>
            <div class="form-group">
                <label for="major" class="col-sm-2 control-label">专业</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="major" name="major" placeholder="请输入专业">
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

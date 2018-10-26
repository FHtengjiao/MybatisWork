package com.xtj.servlet;

import com.xtj.dao.StudentDao;
import com.xtj.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteStudentServlet", urlPatterns = "/deleteStudent")
public class DeleteStudentServlet extends HttpServlet {

    private StudentDao dao = new StudentDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取参数
        String id = request.getParameter("id");

        //构建学生
        Student student = new Student(Long.parseLong(id));

        dao.deleteStudent(student);

        response.sendRedirect("/index");
    }
}

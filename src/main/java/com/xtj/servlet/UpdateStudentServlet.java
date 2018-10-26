package com.xtj.servlet;

import com.xtj.dao.StudentDao;
import com.xtj.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateStudentServlet", urlPatterns = "/updateStudent")
public class UpdateStudentServlet extends HttpServlet {
    private StudentDao dao = new StudentDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //获取参数
        String id = request.getParameter("id");
        String regNo = request.getParameter("regNo");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        String grade = request.getParameter("grade");
        String major = request.getParameter("major");

        //构建学生
        Student student = new Student(Long.parseLong(id), Long.parseLong(regNo), name, sex, Integer.parseInt(age), grade, major);

        //
        Student s = dao.updateStudent(student);

        response.sendRedirect("/showStudent?id=" + s.getId()+"&type=show");

    }
}

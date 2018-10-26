package com.xtj.servlet;

import com.xtj.dao.StudentDao;
import com.xtj.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowCourseServlet", urlPatterns = "/showCourse")
public class ShowCourseServlet extends HttpServlet {

    private StudentDao dao = new StudentDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        Student s = new Student(Long.parseLong(id));

        Student student = dao.getOneStudent(s);

        request.setAttribute("student", student);

        request.getRequestDispatcher("courseList.jsp").forward(request, response);
    }
}

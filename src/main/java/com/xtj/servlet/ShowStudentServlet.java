package com.xtj.servlet;

import com.xtj.dao.StudentDao;
import com.xtj.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowStudentServlet", urlPatterns = {"/showStudent"})
public class ShowStudentServlet extends HttpServlet {

    private StudentDao dao = new StudentDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String type = request.getParameter("type");

        Student student = new Student(Long.parseLong(id));

        Student s = dao.getOneStudent(student);

        request.setAttribute("student", s);

        if("show".equals(type))
            request.getRequestDispatcher("showStudent.jsp").forward(request, response);
        else
            request.getRequestDispatcher("modifyStudent.jsp").forward(request, response);
    }
}

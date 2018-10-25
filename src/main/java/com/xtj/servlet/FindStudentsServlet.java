package com.xtj.servlet;

import com.xtj.dao.StudentDao;
import com.xtj.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FindStudentsServlet", urlPatterns = "/index")
public class FindStudentsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentDao studentDao =  new StudentDao();
        List<Student> students = studentDao.getAllStudents();
        System.out.println(students);
        System.out.println("你好");
        request.setAttribute("list", students);
        request.getRequestDispatcher("studentlist.jsp").forward(request, response);
    }
}

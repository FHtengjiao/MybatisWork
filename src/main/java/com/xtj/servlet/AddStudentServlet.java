package com.xtj.servlet;

import com.xtj.dao.StudentDao;
import com.xtj.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddStudentServlet", urlPatterns = "/addStudent")
public class AddStudentServlet extends HttpServlet {

    private StudentDao studentDao = new StudentDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //获取参数
        String regNo = request.getParameter("regNo");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        String grade = request.getParameter("grade");
        String major = request.getParameter("major");

//        System.out.println(regNo);
//        System.out.println(name);
//        System.out.println(sex);
//        System.out.println(age);
//        System.out.println(grade);
//        System.out.println(major);

        //构建Student对象
        Student student = new Student(Long.parseLong(regNo), name, sex, Integer.parseInt(age), grade, major);

        //添加Student
        Student s = studentDao.addStudent(student);

        //显示添加的学生
        response.sendRedirect("/showStudent?id="+s.getId());
    }
}

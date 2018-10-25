package com.xtj.dao;

import com.xtj.entity.Student;
import com.xtj.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        SqlSession session = SqlSessionFactoryUtils.getFactory().openSession();
        try {
            students = session.selectList("findStudents");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return students;
    }

    public static void main(String[] args) {
        SqlSessionFactoryUtils.initSqlSessionFactory();
        List<Student> students = new StudentDao().getAllStudents();
        System.out.println(students.size());
    }
}

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

    public Student getOneStudent(Student student) {
        SqlSession session = SqlSessionFactoryUtils.getFactory().openSession();
        Student s = null;
        try {
            s = session.selectOne("findStudents", student);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return s;
    }

    public Student addStudent(Student student) {
        SqlSession session = SqlSessionFactoryUtils.getFactory().openSession();
        try {
            session.insert("addStudent", student);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return student;
    }
}

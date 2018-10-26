package com.xtj.entity;

public class Student {
    private Long id;
    private Long regNo;
    private String name;
    private String sex;
    private Integer age;
    private String grade;
    private String major;

    public Student(Long id) {
        this.id = id;
    }

    public Student(Long id, Long regNo, String name, String sex, Integer age, String grade, String major) {
        this.id = id;
        this.regNo = regNo;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.grade = grade;
        this.major = major;
    }

    public Student(Long regNo, String name, String sex, Integer age, String grade, String major) {
        this.regNo = regNo;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.grade = grade;
        this.major = major;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRegNo() {
        return regNo;
    }

    public void setRegNo(Long regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", regNo=" + regNo +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}

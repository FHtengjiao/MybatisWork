package com.xtj.entity;

public class Course {
    private Long id;
    private String courseId;
    private String majorName;
    private String courseName;
    private Float courseTime;
    private String courseTeacher;

    public Course(Long id, String courseId, String majorName, String courseName, Float courseTime, String courseTeacher) {
        this.id = id;
        this.courseId = courseId;
        this.majorName = majorName;
        this.courseName = courseName;
        this.courseTime = courseTime;
        this.courseTeacher = courseTeacher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Float getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Float courseTime) {
        this.courseTime = courseTime;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseId='" + courseId + '\'' +
                ", majorName='" + majorName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseTime=" + courseTime +
                ", courseTeacher='" + courseTeacher + '\'' +
                '}';
    }
}

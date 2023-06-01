package com.sms.studentmanagementsystem.service;

import com.sms.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);

    List<Student> getAllStudents();

    Student updateStudent(Student student);

    Student getStudentById(int id);

    void deleteStudent(int id);
}

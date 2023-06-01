package com.sms.studentmanagementsystem.service.impl;
import com.sms.studentmanagementsystem.entity.Student;
import com.sms.studentmanagementsystem.repo.StudentRepo;
import com.sms.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }
}

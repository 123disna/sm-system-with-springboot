package com.sms.studentmanagementsystem.service.impl;

import com.sms.studentmanagementsystem.entity.Teacher;
import com.sms.studentmanagementsystem.repo.TeacherRepo;
import com.sms.studentmanagementsystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherServiceIMPL implements TeacherService {
    @Autowired
    private TeacherRepo teacherRepo;

    @Override
    public List<Teacher> getAllTeachers() {

        return teacherRepo.findAll();
    }

    @Override
    public Teacher addTeacher(Teacher teacher)
    {
        return teacherRepo.save(teacher);
    }

    @Override
    public Teacher getTeacherById(int id) {

        return teacherRepo.getById(id);
    }

    @Override
    public void deleteTeacher(int id) {

        teacherRepo.deleteById(id);
    }

    @Override
    public Teacher updateTeacher(Teacher existTeacher) {

        return teacherRepo.save(existTeacher);
    }
}

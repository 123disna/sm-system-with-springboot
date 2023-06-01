package com.sms.studentmanagementsystem.service;

import com.sms.studentmanagementsystem.entity.Teacher;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();

    Teacher addTeacher(Teacher teacher);

    Teacher getTeacherById(int id);

    void deleteTeacher(int id);

    Teacher updateTeacher(Teacher existTeacher);
}

package com.sms.studentmanagementsystem.controller;
import com.sms.studentmanagementsystem.entity.Student;
import com.sms.studentmanagementsystem.service.StudentService;
import com.sms.studentmanagementsystem.util.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class StudentController {
    @Autowired
    private StudentService service;

    @Autowired
    private ImageUtils imageUtils;

    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",service.getAllStudents());
        return "students";
    }
    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        Student student=new Student();
        model.addAttribute("student",student);
        return "create_student";
    }
    @PostMapping("/students")
    public String saveAllStudent(@ModelAttribute("student")Student student) {
        service.addStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable(value = "id") int id,Model model){
        model.addAttribute("student",service.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable int id,
                                @ModelAttribute("student")Student student,
                                Model model){
        Student existStudent=service.getStudentById(id);
        existStudent.setFirstName(student.getFirstName());
        existStudent.setLastName(student.getLastName());
        existStudent.setEmail(student.getEmail());

        service.updateStudent(existStudent);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
        return "redirect:/students";
    }
}

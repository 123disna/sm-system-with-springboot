package com.sms.studentmanagementsystem.controller;
import com.sms.studentmanagementsystem.entity.Student;
import com.sms.studentmanagementsystem.entity.Teacher;
import com.sms.studentmanagementsystem.service.StudentService;
import com.sms.studentmanagementsystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TeacherController {
    @Autowired
    private TeacherService service;

    @GetMapping("/teachers")
    public String listTeachers(Model model){
        model.addAttribute("teachers",service.getAllTeachers());
        return "teachers";
    }
    @GetMapping("/teachers/new")
    public String createStudentForm(Model model){
        Teacher teacher=new Teacher();
        model.addAttribute("teacher",teacher);
        return "create_teacher";
    }
    @PostMapping("/teachers")
    public String saveAllTeacher(@ModelAttribute("teacher")Teacher teacher){
        service.addTeacher(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/teachers/edit/{id}")
    public String editTeacherForm(@PathVariable(value = "id") int id,Model model){
        model.addAttribute("teacher",service.getTeacherById(id));
        return "edit_teacher";
    }

    @PostMapping("/teachers/{id}")
    public String updateStudent(@PathVariable int id,
                                @ModelAttribute("teacher")Teacher teacher,
                                Model model){
        Teacher existTeacher=service.getTeacherById(id);
        existTeacher.setTeacherName(teacher.getTeacherName());
        existTeacher.setTeacherAddress(teacher.getTeacherAddress());
        existTeacher.setTeacherEmail(teacher.getTeacherEmail());
        existTeacher.setTeacherSalary(teacher.getTeacherSalary());

        service.updateTeacher(existTeacher);
        return "redirect:/teachers";
    }

    @GetMapping("/teachers/{id}")
    public String deleteTeacher(@PathVariable int id){
        service.deleteTeacher(id);
        return "redirect:/teachers";
    }
}

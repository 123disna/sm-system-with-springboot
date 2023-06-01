package com.sms.studentmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Teacher
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "teacher_id",length = 45,nullable = false)
    private int teacherId;

    @Column(name = "teacher_name",length = 200,nullable = false)
    private String teacherName;

    @Column(name = "teacher_address",length = 200,nullable = false)
    private String teacherAddress;

    @Column(name = "teacher_email",length = 200,nullable = false)
    private String teacherEmail;

    @Column(name = "teacher_salary",length = 200,nullable = false)
    private double teacherSalary;

    public Teacher(String teacherName, String teacherAddress, String teacherEmail, double teacherSalary) {
        this.teacherName = teacherName;
        this.teacherAddress = teacherAddress;
        this.teacherEmail = teacherEmail;
        this.teacherSalary = teacherSalary;
    }
}

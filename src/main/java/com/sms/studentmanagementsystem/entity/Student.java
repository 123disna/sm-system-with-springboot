package com.sms.studentmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id",nullable = false,length = 40)
    private int studentId;

    @Column(name = "student_first_name",nullable = false,length = 200)
    private String firstName;

    @Column(name = "student_last_name",length = 200)
    private String lastName;

    @Column(name = "student_email",length = 200)
    private String email;

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}

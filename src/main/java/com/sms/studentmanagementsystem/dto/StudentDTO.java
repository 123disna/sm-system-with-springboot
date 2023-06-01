package com.sms.studentmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO {

    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
}

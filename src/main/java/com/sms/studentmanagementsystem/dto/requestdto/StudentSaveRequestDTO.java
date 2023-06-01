package com.sms.studentmanagementsystem.dto.requestdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentSaveRequestDTO {
    private String firstName;
    private String lastName;
    private String email;
}

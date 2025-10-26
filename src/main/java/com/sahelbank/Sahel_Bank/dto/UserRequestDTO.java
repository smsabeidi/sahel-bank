package com.sahelbank.Sahel_Bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserRequestDTO {
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private String occupation;
    private String nationality;
    private String idNumber;
    private String email;
    private String address;
    private String phoneNumber;
    private String alternativePhone;
    private String nextOfKing;
    private String role;
    private String username;
    private String password;
}

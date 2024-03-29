package com.youcode.hephaestus.dto.models;

import com.youcode.hephaestus.entities.LogoDesign;
import com.youcode.hephaestus.enums.ERole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class UserDto {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<LogoDesign> logoDesign;
    private ERole role;
}


package com.youcode.hephaestus.dto.models;

import com.youcode.hephaestus.entities.LogoDesign;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDto {
    private String id;
    private LogoDesign logoDesign;
    private String address;
    private String firstName;
    private String lastName;
    private String companyName;
    private String status;
}

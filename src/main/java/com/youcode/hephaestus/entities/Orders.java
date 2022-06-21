package com.youcode.hephaestus.entities;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("orders")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    @Id
    private String id;


    @DBRef
    private LogoDesign logoDesign;
    private String address;

    private String firstName;
    private String lastName;
    private String companyName;
    private String status = "pending";
}

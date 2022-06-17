package com.youcode.hephaestus.entities;

import com.youcode.hephaestus.enums.DNA;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("devices")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LogoDesign {

    @Id
    private String id;
    private String brandName;
    private List<Integer> logoIds;
    private List <DNA> dna;
    private String type;
    private String slogon;
    private String description;
    private String competitor;
    private String inspiration;

}

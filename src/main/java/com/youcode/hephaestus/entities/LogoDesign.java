package com.youcode.hephaestus.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.youcode.hephaestus.enums.DNA;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document("logodesign")
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
    private String lastLogo;
    private String slogon;
    private String description;
    private String competitor;
    private String imageCompetitor;
    private String inspiration;
    private String uploadMore;

    @DBRef
    private User user;

    @CreationTimestamp
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime createdDate;

    @UpdateTimestamp
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime lastUpdate;

}

package com.youcode.hephaestus.dto.models;

import com.youcode.hephaestus.enums.DNA;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class LogoDesignDto {
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
}

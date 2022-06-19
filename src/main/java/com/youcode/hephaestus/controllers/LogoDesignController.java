package com.youcode.hephaestus.controllers;

import com.youcode.hephaestus.entities.LogoDesign;
import com.youcode.hephaestus.enums.DNA;
import com.youcode.hephaestus.services.LogoDesignService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/logodesign")
public class LogoDesignController {

    LogoDesignService logoDesignService;

    @GetMapping
    public List<LogoDesign> getAll(){
        return logoDesignService.getAll();
    }

    @PostMapping("store")
    public void add(@RequestParam Map<String,String> logoDesign,@RequestParam List<Integer> logoIds,@RequestParam List<DNA> dna, @RequestParam("lastLogo") MultipartFile lastLogo, @RequestParam("imageCompetitor") MultipartFile imageCompetitor, @RequestParam("uploadMore") MultipartFile more){
        logoDesignService.add(logoDesign,logoIds,dna,lastLogo,imageCompetitor,more);
    }
}

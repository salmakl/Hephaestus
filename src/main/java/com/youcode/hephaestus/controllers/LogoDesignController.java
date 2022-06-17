package com.youcode.hephaestus.controllers;

import com.youcode.hephaestus.entities.LogoDesign;
import com.youcode.hephaestus.services.LogoDesignService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public LogoDesign add(@RequestBody LogoDesign logoDesign){
        return logoDesignService.addLogoDesign(logoDesign);
    }
}

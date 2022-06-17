package com.youcode.hephaestus.services;

import com.youcode.hephaestus.entities.LogoDesign;
import com.youcode.hephaestus.repositories.LogoDesignRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class LogoDesignService {
    LogoDesignRepository logoDesignRepository;

    public List<LogoDesign> getAll(){
        return logoDesignRepository.findAll();
    }
    public LogoDesign addLogoDesign(LogoDesign logoDesign){
        return logoDesignRepository.save(logoDesign);
    }
}

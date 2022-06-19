package com.youcode.hephaestus.services;

import com.youcode.hephaestus.dto.services.MapString;
import com.youcode.hephaestus.entities.LogoDesign;
import com.youcode.hephaestus.enums.DNA;
import com.youcode.hephaestus.repositories.LogoDesignRepository;
import com.youcode.hephaestus.util.FileUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@Service
public class LogoDesignService {
    LogoDesignRepository logoDesignRepository;



    MapString<Map<String, String>, LogoDesign> toLogo;

    public List<LogoDesign> getAll(){
        return logoDesignRepository.findAll();
    }
    public LogoDesign addLogoDesign(LogoDesign logoDesign){

        return logoDesignRepository.save(logoDesign);
    }

    public void add(Map<String, String> params, List<Integer>logoIds, List<DNA> dna, MultipartFile lastLogo, MultipartFile imageCompetitor, MultipartFile uploadMore){

        LogoDesign logoDesign=toLogo.convertToEntity(params,LogoDesign.class);

        try {
        logoDesign.setLastLogo(addImage(lastLogo));
        logoDesign.setImageCompetitor(addImage(imageCompetitor));
        logoDesign.setUploadMore(addImage(uploadMore));
        logoDesign.setLogoIds(logoIds);
        logoDesign.setDna(dna);

        }catch (Exception e){
            e.printStackTrace();
        }
        logoDesignRepository.save(logoDesign);
    }
    public String addImage(MultipartFile file) throws IOException {

        String fileName="";
        FileUtil.createDirIfNotExist();
        byte[] bytes;

        try {
            bytes = file.getBytes();
            String extension = FileUtil.getExtension(Objects.requireNonNull(file.getOriginalFilename()));
            fileName = UUID.randomUUID() + extension;
            Files.write(Paths.get(FileUtil.folderPath + fileName), bytes);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileName;
    }
}

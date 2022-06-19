package com.youcode.hephaestus.util;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class FileUtil {

    private FileUtil(){

    }
    public static final String folderPath =  "uploads//";
    public static final Path filePath = Paths.get(folderPath);

    public static String getExtension(String originalFilename) {
        return originalFilename.substring(originalFilename.lastIndexOf("."));
    }

    public static void createDirIfNotExist() {
        if (!Files.exists(filePath)) {
            try {
                Files.createDirectories(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}

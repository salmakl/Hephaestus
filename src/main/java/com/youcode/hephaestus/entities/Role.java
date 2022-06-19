package com.youcode.hephaestus.entities;

import com.youcode.hephaestus.enums.ERole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("roles")
public class Role {

    @Id
    private String id;
    private ERole name;

    public String getAuthority() {
        return name.toString();
    }
}

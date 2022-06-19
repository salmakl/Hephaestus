package com.youcode.hephaestus.dto.services;

import lombok.AllArgsConstructor;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MapString<S,E> {


    private ModelMapper modelMapper;

    public E convertToEntity(S mapString, Class<E> entityClass) {
        if(mapString == null)
            return null;

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT).setPropertyCondition(Conditions.isNotNull());
        return modelMapper.map(mapString, entityClass);
    }
}
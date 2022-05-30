package com.example.apishirt.mappers;

import com.example.apishirt.dto.ShirtDTO;
import com.example.apishirt.entity.Shirt;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Mapper(componentModel = "spring")
public interface ShirtMapper {
    ShirtDTO mapToShirtDTO(Shirt shirt);
    Shirt mapToShirt(ShirtDTO shirtDTO);
}

//package com.example.apishirt.mappers;
//
//import com.example.apishirt.dto.ShirtDTO;
//import com.example.apishirt.entity.Shirt;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ShirtMapperImpl implements ShirtMapper {
//    public ShirtMapperImpl() {
//    }
//
//    public ShirtDTO mapToShirtDTO(Shirt shirt) {
//        if (shirt == null) {
//            return null;
//        } else {
//            ShirtDTO shirtDTO = new ShirtDTO();
//            shirtDTO.setId(shirt.getId());
//            shirtDTO.setName(shirt.getName());
//            shirtDTO.setDescription(shirt.getDescription());
//            shirtDTO.setAvailable(shirt.getAvailable());
//            return shirtDTO;
//        }
//    }
//
//    public Shirt mapToShirt(ShirtDTO shirtDTO) {
//        if (shirtDTO == null) {
//            return null;
//        } else {
//            Shirt shirt = new Shirt();
//            shirt.setId(shirtDTO.getId());
//            shirt.setName(shirtDTO.getName());
//            shirt.setDescription(shirtDTO.getDescription());
//            shirt.setAvailable(shirtDTO.getAvailable());
//            return shirt;
//        }
//    }
//}

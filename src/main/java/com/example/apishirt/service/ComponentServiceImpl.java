package com.example.apishirt.service;

import com.example.apishirt.dto.ShirtDTO;
import com.example.apishirt.entity.Shirt;
import com.example.apishirt.mappers.ShirtMapper;
import com.example.apishirt.repo.ShirtRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class ComponentServiceImpl implements ComponentService{

    @Autowired
    ShirtMapper shirtMapper;

    @Autowired
    ShirtRepo shirtRepo;

    public List<ShirtDTO> getAllShirts() {
        List<Shirt> shirtList = shirtRepo.findAll();
        List<ShirtDTO> shirtDTOList = new ArrayList<>();
        for(Shirt shirt: shirtList){
            ShirtDTO shirtDTO = shirtMapper.mapToShirtDTO(shirt);
            shirtDTOList.add(shirtDTO);
        }
        return shirtDTOList;
    }


    public void updateShirtAvailability(List<ShirtDTO> shirtDTOList) {
        System.out.println("=====>");
        List<Shirt> shirtList = shirtRepo.findAll();
        for(ShirtDTO shirtDTO:shirtDTOList) {
            Shirt shirt = shirtRepo.findById(shirtDTO.getId());
            System.out.println("before " + shirt.getAvailable());
            shirt.setAvailable(shirtDTO.getAvailable());
            System.out.println("after" + shirt.getAvailable());
            shirtRepo.save(shirt);
        }
    }


    public ShirtDTO addShirt(ShirtDTO shirtDTO) {
        System.out.println(shirtDTO.getAvailable());
        Shirt savedShirt = shirtRepo.save(shirtMapper.mapToShirt(shirtDTO));
        ShirtDTO toReturn = shirtMapper.mapToShirtDTO(savedShirt);
        return  toReturn;
    }
}

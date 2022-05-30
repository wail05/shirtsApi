package com.example.apishirt.service;

import com.example.apishirt.dto.ShirtDTO;

import java.util.List;
public interface ComponentService {
    public List<ShirtDTO> getAllShirts();
    public void updateShirtAvailability(List<ShirtDTO> shirtDTOList);
    public ShirtDTO addShirt(ShirtDTO shirtDTO);
}

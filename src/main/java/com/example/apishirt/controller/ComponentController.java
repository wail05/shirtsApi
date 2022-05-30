package com.example.apishirt.controller;

import com.example.apishirt.dto.ShirtDTO;
import com.example.apishirt.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import  java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/component")
public class ComponentController {

    @Autowired
    ComponentService componentService;

    @GetMapping("/ping")
    public ResponseEntity<?> pong (){ return new ResponseEntity<>("pong", HttpStatus.OK);}

    @GetMapping("/getAllShirts")
    public ResponseEntity<?> getAllShirts(){
        List<ShirtDTO> shirtDTOList = componentService.getAllShirts();
        return  new ResponseEntity<>(shirtDTOList, HttpStatus.OK);
    }
    @PutMapping("/updateShirtAvailability")
    public ResponseEntity<?> updateShirtAvailability(@RequestBody List<ShirtDTO> shirtDTOList){
        componentService.updateShirtAvailability(shirtDTOList);
        return new ResponseEntity<>(null, HttpStatus.OK);

    }
    @PostMapping("/addShirt")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> addShirt(@RequestBody ShirtDTO shirtDTO) {
        System.out.println("hhhhhh");
        ShirtDTO toReturn = componentService.addShirt(shirtDTO);
        return new ResponseEntity<>(toReturn, HttpStatus.OK);
    }
}



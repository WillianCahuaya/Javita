package com.autonoma.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("brands")

public class BrandController {
    
    @GetMapping("all")
    public String getBrands(){
        return "Mi Marca";
    }
       
}

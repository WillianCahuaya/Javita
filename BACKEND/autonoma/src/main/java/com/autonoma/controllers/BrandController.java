package com.autonoma.controllers;

import com.autonoma.utils.MemoryUser;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("brands")

public class BrandController {
    
    @GetMapping("all")
    public String getBrands(){
        return "Mi Marca";
    }
    
    @PostMapping("create")
    public String createBrands(){
        return "Se creo la marca";
    }
    
    @GetMapping("read/{id}")
    public String getBrands(@PathVariable("id") Integer id) {
        return "Obteniendo la marca con el nombre: ";
    }
    
    @PutMapping("update")
        public String updateBrands(){
        return "Se esta actualizando la marca";
    }
    
    @DeleteMapping("delete")
        public String deleteBrands(){
        return "Se esta eliminando la marca";
    }
 }

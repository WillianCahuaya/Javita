package com.autonoma.controllers;

import com.autonoma.utils.MemoryUserDB;
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
        System.out.println("Se comenzo a crear la marca del producto");
        MemoryUserDB.init();
        return "Se creo la marca";
    }
    
    @GetMapping("read/{id}")
    public String getBrands(@PathVariable("id") Integer id) {
        System.out.println("Se intenta llamar a la marca: " + id);
        String value = MemoryUserDB.read(id);
        return "Obteniendo la marca con el nombre: " + value;
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

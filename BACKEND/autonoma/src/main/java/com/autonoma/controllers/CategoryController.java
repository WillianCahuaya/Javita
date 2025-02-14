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
@RequestMapping("categories")
public class CategoryController {

    @PostMapping("create")
    public String createCategories() {
        System.out.println("Se comienza a crear categorias");
        MemoryUserDB.init();
        return "Se ha creado categorias";
    }
    
    @GetMapping("read/{id}")
    public String getCategories(@PathVariable("id") Integer id) {
        System.out.println("Se intenta llamar al usuario: " + id);
        String value = MemoryUserDB.read(id);
        return "Obteniendo mi usuario con nombre: " + value;
    }
    
    @PutMapping("update")
    public String updateCategories() {
        return "Actualziando mi usuario";
    }
    
    @DeleteMapping("delete")
    public String deleteCategories() {
        return "Eliminando mi usuario";
    }
   
} 
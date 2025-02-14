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
@RequestMapping("products")
public class ProductController {
    
    
    @GetMapping("all")
    public String getProducts(){
        return "Mis Productos";
    }  
    
    @PostMapping("create")
    public String createProducts(){
        System.out.println("Se comieza a crear los productos");
        MemoryUserDB.init();
        return "Se ha creado los productos,de cada categoria";
    }
    
    @GetMapping("read/{id}")
     public String getProducts(@PathVariable("id")Integer id){
        System.out.println("Se intenta llamar al producto: " + id);
        String value = MemoryUserDB.read(id);
        return "Obtener usuario con su nombre: " + value;
     }
     
    @PutMapping("update")
    public String updateProducts(){
        return "Se actualizo los productos";
    }
    
    @DeleteMapping("delete")
    public String deleteProducts(){
        return "Se ha eliminado el producto";
    }
 }
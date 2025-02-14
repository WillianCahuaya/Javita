package com.autonoma.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")

public class ClientController {
    
    @PostMapping("create")
    public String createClient() {
        return "Se ha creado cliente";
    }
    
    @GetMapping("read/{id}")
    public String getClient(@PathVariable("id") Integer id) {
        return "Obteniendo mi usuario con nombre: ";
    }
    
    @PutMapping("update")
    public String updateClient() {
        return "Actualziando mi cliente";
    }
    
    @DeleteMapping("delete")
    public String deleteClient() {
        return "Eliminando mi cliente";
    }
   
}

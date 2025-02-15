package com.autonoma.controllers;

import com.autonoma.dtos.ClientDto;
import com.autonoma.utils.MemoryClient;
import java.util.Map;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("client")

public class ClientController {
    
    @PostMapping("create")
    public String createClient(@RequestBody ClientDto clientDto) {
        MemoryClient memoryClient = new MemoryClient();
        memoryClient.create(clientDto);
        return "Cliente creado: " + clientDto;
    }
    
    @GetMapping("get/{id}")
    public String getClient(@PathVariable("id") Integer id) {
        MemoryClient memoryClient =new MemoryClient();
        String value = memoryClient.getById(id);
        return "Cliente: " + value;
    }
    @GetMapping("getAll")
    public Map getAllClient(){
        MemoryClient memoryClient = new MemoryClient();
        return memoryClient.getAll();
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

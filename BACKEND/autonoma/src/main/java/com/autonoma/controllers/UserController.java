package com.autonoma.controllers;

import com.autonoma.utils.MemoryUser;
import com.autonoma.dtos.UserDto;
import java.util.Map;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    //CRUD =>  Create, Read, Update, Delete
    
    @PostMapping("create")
    public String createUser(@RequestBody UserDto userDto) {
        MemoryUser memoryUser = new MemoryUser(); //Para crear una instancia en un objeto
        memoryUser.create(userDto);
        return "Usuario creado: " + userDto;
    }
    
    @GetMapping("get/{id}")
    public String getUsersById(@PathVariable("id") Integer id) {
        MemoryUser memoryUser = new MemoryUser(); 
        String value = memoryUser.getById(id);
        return "Usuario: " + value;
    }
    
    @GetMapping("getAll")
    public Map getAllUsers() {
        MemoryUser memoryUser = new MemoryUser();
        return memoryUser.getAll();
    }
    
    @PutMapping("update")
    public String updateUser() {
        return "Actualziando mi usuario";
    }
    
    @DeleteMapping("delete")
    public String deleteUser() {
        return "Eliminando mi usuario";
    }
   
}

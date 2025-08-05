package com.autonoma.controllers;

import com.autonoma.dtos.UserDto;
import com.autonoma.utils.MemoryUser;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    //CRUD =>  Create, Read, Update, Delete
    
    @PostMapping("create")
    public String createUser(@RequestBody UserDto userDto) {
        MemoryUser memoryUser = new MemoryUser();
        memoryUser.create(userDto);
        return "Usuario creado: " + userDto;
    }
    
    @GetMapping("{id}")
    public String getUsersById(@PathVariable("id") Integer id) {
        MemoryUser memoryUser = new MemoryUser();
        return "Usuario: " + memoryUser.getById(id);
    }
    
    @GetMapping()
    public List getAllUsers() {
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

package com.autonoma.utils;

import dtos.UserDto;
import java.util.HashMap;
import java.util.Map;

//clase
public class MemoryUser {

    //declaracion de variable a nivel de clase
    static Map memory = null;

    //constructor
    public MemoryUser() {
        init();
    }

    //metodo
    private void init() {
        if (memory == null) {
            System.out.println("Contruyendo usuarios");
            memory = new HashMap<Integer, String>();
            memory.put(1, "Liliana");
            memory.put(2, "Jhon");
            memory.put(3, "Willian");
        }
    }

    //metodo
    public String getById(int id) {
        String value = (String) memory.get(id);
        return value;
    }
    
    public Map getAll() {
        return memory;
    }
    
    //metodo
    public void create(UserDto userDto) {
        memory.put(userDto.getId(), userDto.getName());
    }

}

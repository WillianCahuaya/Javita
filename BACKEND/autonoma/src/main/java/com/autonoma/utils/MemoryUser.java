package com.autonoma.utils;

import com.autonoma.dtos.UserDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
            memory = new HashMap<Integer, UserDto>();
            memory.put(1, new UserDto(1, "Pedro"));
            memory.put(2, new UserDto(2, "Juan"));
            memory.put(3, new UserDto(3, "Miguel"));
            memory.put(4, new UserDto(4, "Jose"));
            memory.put(5, new UserDto(5, "Ernesto"));
            memory.put(7, new UserDto(7, "Gabriel"));
            memory.put(6, new UserDto(6, "Luis"));
        }
    }

    //metodo
    public UserDto getById(int id) {
        return (UserDto) memory.get(id);
    }
    
    public List getAll() {
        List<UserDto> list = new ArrayList<>(memory.values());
        return list;
    }
    
    //metodo
    public void create(UserDto userDto) {
        memory.put(userDto.getId(), userDto.getName());
    }

}

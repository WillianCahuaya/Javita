package com.autonoma.utils;

import com.autonoma.dtos.UserDto;

import java.util.ArrayList;
import java.util.List;

//clase
public class MemoryUser {

    //declaracion de variable a nivel de clase
    static List<UserDto> memoryList = null;

    //constructor
    public MemoryUser() {
        init();
    }

    //metodo
    private void init() {
        int i = 0;
        if (memoryList == null) {
            memoryList = new ArrayList<UserDto>();
            memoryList.add(new UserDto(++i, "Pedro"));
            memoryList.add(new UserDto(++i, "Juan"));
            memoryList.add(new UserDto(++i, "Miguel"));
            memoryList.add(new UserDto(++i, "Jose"));
        }
    }

    //metodo
    public UserDto getById(int id) {
        return (UserDto) memoryList.get(id);
    }
    
    public List getAll() {
        return memoryList;
    }
    
    //metodo
    public void create(UserDto userDto) {
        memoryList.add(userDto);
    }

}


package com.autonoma.utils;

import com.autonoma.dtos.CategoryDto;
import java.util.HashMap;
import java.util.Map;


public class MemoryCategory {
    
    static Map memory = null;
    
    public MemoryCategory(){
        init();
    }
    
    private void init() {
        if (memory == null) {
            System.out.println("construyendo categorias");
            memory = new HashMap<Integer, String>();
            memory.put(1, "Correo");
            memory.put(2, "Telefono");
            memory.put(3, "Direccion");
        }
    }
    
    public String getById(int id) {
        String value = (String) memory.get(id);
        return value;
    }
    
    public Map getAll(){
        return memory;
    }
    
    public void create (CategoryDto categoryDto){
        memory.put(categoryDto.getId(), categoryDto.getName());
    }
}

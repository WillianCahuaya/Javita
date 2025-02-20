package com.autonoma.utils;

import com.autonoma.dtos.BrandDto;
import java.util.HashMap;
import java.util.Map;

public class MemoryBrand {
    
    static Map memory = null;
    
    public MemoryBrand(){
        init();
    }
    
    private void init(){
        if(memory == null){
            System.out.println("Construyendo la Marca");
            memory = new HashMap<Integer, String>();
            memory.put(1, "Marca a");
            memory.put(2, "Marca b");
            memory.put(3, "Marca c");
        }
    }
    
    public String getById(int id){
        String value = (String) memory.get(id);
        return value;
    }
    
    public Map getAll(){
        return memory;
    }
    
    public void create(BrandDto brandDto){
        memory.put(brandDto.getId(), brandDto.getName());
    }
}

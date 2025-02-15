package com.autonoma.utils;

import com.autonoma.dtos.ClientDto;
import java.util.HashMap;
import java.util.Map;

public class MemoryClient {

    
    static Map memory = null;
    
    public MemoryClient(){
        init();
    }
    
  private void init() {
        if (memory == null) {
            System.out.println("Contruyendo cliente");
            memory = new HashMap<Integer, String>();
            memory.put(1, "Iver");
            memory.put(2, "Lisbeth");
            memory.put(3, "Alice");
        }
    }

    public String getById(int id) {
        String value = (String) memory.get(id);
        return value;
    }
    
    public Map getAll() {
        return memory;
    }
  
    public void create(ClientDto clientDto) {
        memory.put(clientDto.getId(), clientDto.getName());
    }
}


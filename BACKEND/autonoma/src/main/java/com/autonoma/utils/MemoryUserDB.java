
package com.autonoma.utils;

import java.util.HashMap;
import java.util.Map;

public class MemoryUserDB {
    
    static Map memory = new HashMap<Integer, String>();
    
    public static void init(){
        memory.put(1, "Liliana");
        memory.put(2, "Jhon");
        memory.put(3, "Willian");
        System.out.println("Se ha creado usuarios en memoria");
    }
    
    public static String read(int id) {
        String value = (String) memory.get(id);
        System.out.println("Se esta obteniendo un usuario de la memoria: " + value);
        return value;
    }
    
}

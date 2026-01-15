package com.autonoma.utils;

import com.autonoma.dtos.ProductDto;
import java.util.HashMap;
import java.util.Map;

public class MemoryProduct {
    
    static Map memory = null;
    
    public MemoryProduct(){
        init();
    }
    
private void init() {
    if (memory == null) {
        System.out.println("Construyendo los productos");
        memory = new HashMap<Integer, String>();
        memory.put(1, "Producto nuevo");
        memory.put(2, "Producto nuevo");
        memory.put(3, "Producto nuevo");
    }
}

public String getById(int id) {
    String value = (String) memory.get(id);
    return value;
}
public Map getAll() {
    return memory; 
}

public void create(ProductDto productDto){
    memory.put(productDto.getId(), productDto.getName());
    
}

}

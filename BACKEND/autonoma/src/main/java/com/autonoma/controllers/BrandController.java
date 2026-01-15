package com.autonoma.controllers;

import com.autonoma.dtos.BrandDto;
import com.autonoma.utils.MemoryBrand;
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
@RequestMapping("brands")

public class BrandController {
    
    @PostMapping("create")
    public String createBrand(@RequestBody BrandDto brandDto) {
        MemoryBrand memoryBrand = new MemoryBrand();
        memoryBrand.create(brandDto);
        return "Marca creada: " + brandDto;
    }
    
    @GetMapping("get/{id}")
    public String getBrandById(@PathVariable("id") Integer id) {
        MemoryBrand memoryBrand = new MemoryBrand();
        String value = memoryBrand.getById(id);
        return "Marca: " + value;
    }
   
    @GetMapping("getAll")
    public Map getAllBrand(){
        MemoryBrand memoryBrand = new MemoryBrand();
        return memoryBrand.getAll();
    }
    
    @PutMapping("update")
        public String updateBrands(){
        return "Se esta actualizando la marca";
    }
    
    @DeleteMapping("delete")
        public String deleteBrands(){
        return "Se esta eliminando la marca";
    }
 }

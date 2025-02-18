package com.autonoma.controllers;

import com.autonoma.dtos.ProductDto;
import com.autonoma.utils.MemoryProduct;
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
@RequestMapping("products")
public class ProductController{
    
    @PostMapping("create")
    public String createProduct(@RequestBody ProductDto productDto){
        MemoryProduct memoryProduct = new MemoryProduct();
        memoryProduct.create (productDto);
        return "Se ha creado los productos: " + productDto;
    }
    
    @GetMapping("get/{id}")
     public String getProductById(@PathVariable("id")Integer id){
         MemoryProduct memoryProduct = new MemoryProduct();
         String value = memoryProduct.getById(id);
        return "Producto: " + value;
     }
     
     @GetMapping("getAll")
     public Map getAllProducts(){
         MemoryProduct memoryProduct = new MemoryProduct();
         return memoryProduct.getAll(); 
     } 
     
    @PutMapping("update")
    public String updateProducts(){
        return "Se actualizo los productos";
    }
    
    @DeleteMapping("delete")
    public String deleteProducts(){
        return "Se ha eliminado el producto";
    }
 }
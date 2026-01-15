package com.autonoma.controllers;

import com.autonoma.dtos.CategoryDto;
import com.autonoma.utils.MemoryCategory;
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
@RequestMapping("categories")
public class CategoryController {

    @PostMapping("create")
    public String createCategory(@RequestBody CategoryDto categoryDto) {
        MemoryCategory memoryCategory = new MemoryCategory();
        memoryCategory.create(categoryDto);
        return "categoria creado: " + categoryDto;
    }

    @GetMapping("get/{id}")
    public String getCategoriesById(@PathVariable("id") Integer id) {
        MemoryCategory memoryCategory = new MemoryCategory();
        String value = memoryCategory.getById(id);
        return "categoria:  " + value;
    }

    @GetMapping("getAll")
    public Map getAllCategories() {
        MemoryCategory memoryCategory = new MemoryCategory();
        return memoryCategory.getAll();
    }

    @PutMapping("update")
    public String updateCategory() {
        return "Actualziando categorias";
    }

    @DeleteMapping("delete")
    public String deleteCategory() {
        return "Eliminando categorias";
    }

}

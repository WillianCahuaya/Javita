package com.autonoma.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categories")
public class CategoryController {

    @GetMapping("all")
    public String getCategories() {
        return "Mis Categorias";
    }
}

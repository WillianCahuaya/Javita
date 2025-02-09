package com.autonoma.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")

public class ClientController {

    @GetMapping("all")
    public String getcustomers() {
        return "mis clientes";
    }
}

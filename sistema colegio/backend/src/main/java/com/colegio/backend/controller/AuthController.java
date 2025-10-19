package com.colegio.backend.controller;

import com.colegio.backend.model.Role;
import com.colegio.backend.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public Map<String, String> register(@RequestBody Map<String, String> body) {
        String token = authService.register(
                body.get("nombre"),
                body.get("email"),
                body.get("password"),
                Role.valueOf(body.get("role").toUpperCase())
        );
        return Map.of("token", token);
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> body) {
        String token = authService.login(body.get("email"), body.get("password"));
        return Map.of("token", token);
    }
}

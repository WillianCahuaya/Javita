package com.autonoma.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "client")
@Data
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre completo del cliente
    @Column(nullable = false)
    private String Name;

    // Documento de identidad (DNI, RUC, etc.)
    @Column(nullable = false, unique = true)
    private String dni;

    // Teléfono del cliente
    @Column(nullable = true)
    private String phone;

    // Correo electrónico
    @Column(nullable = false, unique = true)
    private String email;

    // Dirección
    @Column(nullable = true)
    private String address;

    // Estado del cliente (activo/inactivo)
    @Column(nullable = false)
    private Boolean active = true;
}


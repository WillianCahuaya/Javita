package com.autonoma.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "brands")
@Data
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre de la marca
    @Column(nullable = false, unique = true)
    private String name;

    // País de origen
    @Column(nullable = true)
    private String country;

    // Año de fundación
    @Column(nullable = true)
    private Integer foundedYear;

    // Descripción de la marca
    @Column(length = 500)
    private String description;

    // Estado (activo/inactivo)
    @Column(nullable = false)
    private Boolean active = true;
}


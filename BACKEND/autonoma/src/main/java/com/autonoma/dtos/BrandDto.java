package com.autonoma.dtos;

import lombok.Data;
import lombok.ToString;

@ToString
@Data

public class BrandDto {
   

    private Long id;

    private String dni;

    private String username;

    private String email;

    private String role;

    private String password;
    
    private String telefono;

    public Object getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

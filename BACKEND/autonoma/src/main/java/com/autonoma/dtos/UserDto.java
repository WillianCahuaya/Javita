package com.autonoma.dtos;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class UserDto {

    private Long id;

    private String dni;

    private String username;

    private String email;

    private String role;

    private String password;

}

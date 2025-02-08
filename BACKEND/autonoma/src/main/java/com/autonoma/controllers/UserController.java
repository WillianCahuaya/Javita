package com.autonoma.controllers;
//package           => Es el lugar donde esta tu clase

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import           => Es para importar otras liberias o clases generadas
//public            => Modificado de acceso
//class             => determinar que esto es una clase
//UserController    => Es el nombre de la clase
//@RestController   => En una anotacion para generar instancia automaticamente
//@RequestMapping("users")  => Anotacion para el nombre base del servisio de user controller

@RestController
@RequestMapping("users")
public class UserController {

    //public    => Modificado de acceso
    //String    => Un objeto de retorno, objeto de salida
    //getUsers  => El nombre del metodo o funcion
    //()        => El lugar donde van los parametros de entrada
    //return    => Es para retornar el objeto
    //@GetMapping("all")    => Anontacion para asignar un nombre al servicio
    
    @GetMapping("all")
    public String getUsers() {
        return "Mis usuarios activos";
    }
    
}

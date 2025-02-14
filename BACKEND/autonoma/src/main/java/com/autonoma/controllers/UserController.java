package com.autonoma.controllers;
//package           => Es el lugar donde esta tu clase

import com.autonoma.utils.MemoryUserDB;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    
    //CRUD =>  Create, Read, Update, Delete
    
    @PostMapping("create")
    public String createUser() {
        System.out.println("Se comienza a crear los usuarios");
        MemoryUserDB.init();
        return "Se ha creado usaurios";
    }
    
    @GetMapping("read/{id}")
    public String getUsers(@PathVariable("id") Integer id) {
        System.out.println("Se intenta llamar al usuario: " + id);
        String value = MemoryUserDB.read(id);
        return "Obteniendo mi usuario con nombre: " + value;
    }
    
    @PutMapping("update")
    public String updateUser() {
        return "Actualziando mi usuario";
    }
    
    @DeleteMapping("delete")
    public String deleteUser() {
        return "Eliminando mi usuario";
    }
   
}

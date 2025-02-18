package com.autonoma.dtos;

public class ProductDto {
    private int id;
    private String name;
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }        
    public String getName(){
        return name;  
    }  
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "ProductDto{" + "id=" + id + ", name=" + name + ')';
    }
}

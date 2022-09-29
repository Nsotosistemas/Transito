/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author neyder
 */
public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String contacto;
    
    
    
    public Persona(){
    
    }
    
    public Persona(String cedula,String nombre,String apellido,String contacto){
    this.cedula=cedula;
    this.nombre=nombre;
    this.apellido=apellido;
    this.contacto=contacto;      
    }
    
    
    public void setCedula(String cedula){
    this.cedula=cedula;
    }
    
    public String getCedula(){
    return cedula;
    }
    
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public void setApellido(String apellido){
    this.apellido=apellido;
    }
    
    public String getApellido(){
    return apellido;
    }
    
    public void setContacto(String contacto){
    this.contacto=contacto;
    }
    
    public String getContacto(){
    return contacto;
    }
    
    public String toString(){
    return ("\nCedula: "+cedula+"\nNombre: "+nombre+"\nApellido: "+apellido+"\nContacto: "+contacto);
    
    }
    
    
    
  
    
    
}

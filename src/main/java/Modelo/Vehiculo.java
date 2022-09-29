/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author neyder
 */
public class Vehiculo {
    
    private String placa;
    private Integer modelo;
    private String marca;
    private String dueño;
    
    
    
    public Vehiculo(){
    
    }
    
    public Vehiculo(String placa,Integer modelo,String marca,String dueño){
    this.placa=placa;
    this.modelo=modelo;
    this.marca=marca;
    this.dueño=dueño;
    }
    
    public void setPlaca(String placa){
    this.placa=placa;
    }
    
    public String getPlaca(){
    return placa;
    }
    
    public void setModelo(Integer modelo){
    this.modelo=modelo;
    }
    
    public Integer getModelo(){
    return modelo;
    }
    
    public void setMarca(String marca){
    this.marca=marca;
    }
    
    public String getMarca(){
    return marca;
    }
    
    public void setDueño(String dueño){
    this.dueño=dueño;
    }
    
    public String getDueño(){
    return dueño;
    }
    
    
    public String toString(){
    return ("\nplaca: "+placa+"\nModelo: "+modelo+"\nMarca: "+marca+"\nDueño:"+dueño);
    }
    
    
    
}

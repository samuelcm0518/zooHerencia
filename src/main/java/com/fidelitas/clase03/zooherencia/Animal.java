/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.clase03.zooherencia;

/**
 *
 * @author Usuario
 */
public class Animal {
    
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String hacerSonido() {
        return "Mi sonido es: ";
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + '}';
    }
       
}

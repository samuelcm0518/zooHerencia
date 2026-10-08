/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.clase03.zooherencia;

/**
 *
 * @author Usuario
 */
public class Mamifero extends Animal {
    
    public Mamifero(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return super.hacerSonido() + " (Sonido de mamifero) ";        
    }
    
    
    
}

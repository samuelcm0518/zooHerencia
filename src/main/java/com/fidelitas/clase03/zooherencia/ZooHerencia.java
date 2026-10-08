/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fidelitas.clase03.zooherencia;

/**
 *
 * @author Usuario
 */
public class ZooHerencia {

    public static void main(String[] args) {
        
        Animal perro = new GoldenRetriever("Tamy");
        Mamifero gato = new MaineCoon("Max");
        
        Animal pato = new Ave("Lucas");
        Cayuga otroPato = new Cayuga("Donald");
        Ave tercerPato = new Pato("Juancho");
        
        System.out.println(perro.hacerSonido());
        System.out.println(gato.hacerSonido());
        
        System.out.println("+++++++++++ PATOS ++++++++++");
        System.out.println(pato.hacerSonido());
        System.out.println(otroPato.hacerSonido());
        System.out.println(tercerPato.hacerSonido());
    }
}

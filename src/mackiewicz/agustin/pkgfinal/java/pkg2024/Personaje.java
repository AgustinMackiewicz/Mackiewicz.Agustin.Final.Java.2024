/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mackiewicz.agustin.pkgfinal.java.pkg2024;

/**
 *
 * @author Usuario
 */
public abstract class Personaje {
    public String nombrePersonaje;
    public int altura;
    public int puntosVida;
    
    public void atacar(){
         System.out.println(nombrePersonaje + "Esta atacando");
    }
    
    public void defender(){
            System.out.println(nombrePersonaje + "se esta defendiendo");
    }
    
    public void descansar(){
        System.out.println(nombrePersonaje + "esta descansando");
    }

    public Personaje(String nombrePersonaje, int altura, int puntosVida) {
        this.nombrePersonaje = nombrePersonaje;
        this.altura = altura;
        this.puntosVida = puntosVida;
    }
    
    
    
}

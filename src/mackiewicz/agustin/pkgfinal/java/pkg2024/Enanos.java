/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mackiewicz.agustin.pkgfinal.java.pkg2024;

/**
 *
 * @author Usuario
 */
public class Enanos extends Personaje{
    public TrabajoEnano trabajo;
    public int tamanioBarba;

    public Enanos(TrabajoEnano trabajo, int tamanioBarba, String nombrePersonaje, int altura, int puntosVida) {
        super(nombrePersonaje, altura, puntosVida);
        this.trabajo = trabajo;
        this.tamanioBarba = tamanioBarba;
    }

    public Enanos(int tamanioBarba, String nombrePersonaje, int altura, int puntosVida) {
        super(nombrePersonaje, altura, puntosVida);
        this.tamanioBarba = tamanioBarba;
        this.trabajo = TrabajoEnano.Herrero;
    }

    public Enanos(String nombrePersonaje, int altura, int puntosVida) {
        super(nombrePersonaje, altura, puntosVida);
        this.trabajo = TrabajoEnano.Herrero;
        this.tamanioBarba = 40;
    }
    
    

    
}

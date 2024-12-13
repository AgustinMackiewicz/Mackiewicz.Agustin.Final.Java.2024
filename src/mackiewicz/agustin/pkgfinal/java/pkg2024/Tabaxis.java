/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mackiewicz.agustin.pkgfinal.java.pkg2024;

/**
 *
 * @author Usuario
 */
public class Tabaxis extends Personaje{
    public RazaTabaxis raza;
    public int tamanioPelaje;

    public Tabaxis(RazaTabaxis raza, int tamanioPelaje, String nombrePersonaje, int altura, int puntosVida) {
        super(nombrePersonaje, altura, puntosVida);
        this.raza = raza;
        this.tamanioPelaje = tamanioPelaje;
    }

    public Tabaxis(int tamanioPelaje, String nombrePersonaje, int altura, int puntosVida) {
        super(nombrePersonaje, altura, puntosVida);
        this.tamanioPelaje = tamanioPelaje;
        this.raza = RazaTabaxis.TabaxiLeón;
    }

    public Tabaxis(String nombrePersonaje, int altura, int puntosVida) {
        super(nombrePersonaje, altura, puntosVida);
        this.raza = RazaTabaxis.TabaxiLeón;
        this.tamanioPelaje = 3;
    }
    
    
}

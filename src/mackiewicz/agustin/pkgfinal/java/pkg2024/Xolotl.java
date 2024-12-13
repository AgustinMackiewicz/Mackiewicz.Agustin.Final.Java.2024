/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mackiewicz.agustin.pkgfinal.java.pkg2024;

/**
 *
 * @author Usuario
 */
public class Xolotl extends Personaje {
    public TiposAjolote tiposDeAjolote;
    public int cantidadDeBranquias;

    public Xolotl(TiposAjolote tiposDeAjolote, int cantidadDeBranquias, String nombrePersonaje, int altura, int puntosVida) {
        super(nombrePersonaje, altura, puntosVida);
        this.tiposDeAjolote = tiposDeAjolote;
        this.cantidadDeBranquias = cantidadDeBranquias;
    }

    public Xolotl(int cantidadDeBranquias, String nombrePersonaje, int altura, int puntosVida) {
        super(nombrePersonaje, altura, puntosVida);
        this.cantidadDeBranquias = cantidadDeBranquias;
        this.tiposDeAjolote = TiposAjolote.Firefly;
    }

    public Xolotl(String nombrePersonaje, int altura, int puntosVida) {
        super(nombrePersonaje, altura, puntosVida);
        this.cantidadDeBranquias = 6;
        this.tiposDeAjolote = TiposAjolote.Firefly;    
    }
    
    
    
}

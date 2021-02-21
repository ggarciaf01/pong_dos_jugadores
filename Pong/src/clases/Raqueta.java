/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 * Clase que controla el funcionamiento de las raquetas
 * @author Guillermo García Fernández
 */
public class Raqueta {

    private int x, y;
    static final int ANCHO = 10, ALTO = 40;

    public Raqueta(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return Devuelve la raqueta
     */
    public Rectangle2D getRaqueta() {
        return new Rectangle2D.Double(x, y, ANCHO, ALTO);
    }

    /**
     * Mover la raqueta del jugador1
     * @param limites 
     */
    public void moverR1(Rectangle limites) {
        if (EventoTeclado.w && y > limites.getMinY()) {
            y--;
        }
        if (EventoTeclado.s && y < limites.getMaxY()-ALTO) {
            y++;
        }
    }

    /**
     * Mover la raqueta del jugador2
     * @param limites
     */
    public void moverR2(Rectangle limites) {
        if (EventoTeclado.up && y > limites.getMinY()) {
            y--;
        }
        if (EventoTeclado.down && y < limites.getMaxY()-ALTO) {
            y++;
        }
    }
}

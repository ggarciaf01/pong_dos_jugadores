package clases;

import java.awt.event.*;

/**
 * Clase que controla que tecla se pulsa y que tecla se deja de pulsar
 * @author Guillermo García Fernández
 */
public class EventoTeclado extends KeyAdapter {

    /**
     * Variables para las teclas
     */
    static boolean w, s, up, down;

    /**
     * Controla que tecla se está pulsando
     */
    @Override
    public void keyPressed(KeyEvent e) {

        int id = e.getKeyCode();
        if (id == KeyEvent.VK_W) {
            w = true;

        }
        if (id == KeyEvent.VK_S) {
            s = true;

        }
        if (id == KeyEvent.VK_UP) {
            up = true;
        }
        if (id == KeyEvent.VK_DOWN) {
            down = true;
        }
    }

    /**
     * Controla que tecla se deja de pulsar
     */
    @Override
    public void keyReleased(KeyEvent e) {

        int id = e.getKeyCode();
        if (id == KeyEvent.VK_W) {
            w = false;
        }
        if (id == KeyEvent.VK_S) {
            s = false;
        }
        if (id == KeyEvent.VK_UP) {
            up = false;
        }
        if (id == KeyEvent.VK_DOWN) {
            down = false;
        }
    }

}

package clases;

import javax.swing.*;

import control.EngineGraphics;

/**
 * Clase que crea la ventana del programa
 * @author Guillermo García Fernández
 */
public class Ventana extends JFrame {

    Tablero canvas;
    Pelota p = new Pelota();

    public Ventana() {
        setTitle("Pong DEMO");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        canvas = new Tablero();
        add(canvas);

        addKeyListener(new EventoTeclado());
        new EngineGraphics(canvas).start();
    }

}

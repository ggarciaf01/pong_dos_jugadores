package control;

import clases.Tablero;
import clases.Pelota;

/**
 * Clase hilo que controla el refresco del juego
 * @author Guillermo García Fernández
 */
public class EngineGraphics extends Thread {

    private final Tablero canvas;

    public EngineGraphics(Tablero canvas) {
        this.canvas = canvas;
    }

    @Override
    public void run() {
        while (!Pelota.finJuego) {
            canvas.repaint();
            try {
                //Velocidad de repintado
                Thread.sleep(6);
            } catch (Exception ex) {
                System.out.println("error in graphics engine: " + ex.getMessage());
            }
        }
    }
}

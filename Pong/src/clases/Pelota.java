package clases;

import java.awt.geom.Rectangle2D;

/**
 * Clase que controla el funcionamiento de la pelota
 * Es un sprite
 * @author Guillermo García Fernández
 */
public class Pelota {

    private static final int anchoRectangulo = 15;
    private static final int altoRectangulo = 15;
    private double x = 0;
    private static double y = 0;
    private double nuevoX = 1;
    private double nuevoY = 1;
   
    private Integer score1 = 0, score2 = 0;
    public static boolean finJuego = false;
    
    /**
     * @return Devuelve la pelota
     */
    public Rectangle2D getShape() {
        return new Rectangle2D.Double(x, y, anchoRectangulo, altoRectangulo);
    }

    /**
     * Mueve la pelota y controla las colisiones
     */
    public void moverPelota(Rectangle2D limites, boolean colisionR1, boolean colisionR2) {
        x += nuevoX;
        y += nuevoY;

        

        if (colisionR1) {
            nuevoX = -nuevoX;
            x = 20;
        }
        if (colisionR2) {
            nuevoX = -nuevoX;
            x = 755;
        }

        if (x < limites.getMinX()) {
            score2++; //la puntuación del jugador2 aumenta en uno
           
            x = limites.getCenterX();
            y = limites.getCenterY();
            nuevoX = -nuevoX;
        }

        if (x + anchoRectangulo >= limites.getMaxX()) {
            score1++; //la puntuación del jugador1 aumenta en uno
            
            x = limites.getCenterX();
            y = limites.getCenterY();
            nuevoX = -nuevoX;
        }

        if (y < limites.getMinY()) {

            y = limites.getMinY();

            nuevoY = -nuevoY;
        }

        if (y + altoRectangulo >= limites.getMaxY()) {

            y = limites.getMaxY() - altoRectangulo;

            nuevoY = -nuevoY;
        }

    }

    /**
     * Getter de la puntuación del jugador1
     */
    public int getScore1() {
        return score1;
    }

    /**
     * Getter de la puntuación del jugador2
     */
    public int getScore2() {
        return score2;
    }

    
    
}

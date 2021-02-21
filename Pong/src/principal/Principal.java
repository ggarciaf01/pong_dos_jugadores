package principal;

import clases.Ventana;
import javax.swing.JFrame;

/**
 * Clase principal del programa
 * @author Guillermo García FernándezS
 */

public class Principal {
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

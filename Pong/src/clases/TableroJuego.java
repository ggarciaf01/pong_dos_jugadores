/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 * Clase que pinta el tablero por pantalla
 * @author Guillermo García Fernández
 */
public class TableroJuego extends JPanel {

    public TableroJuego() {
        setBackground(Color.BLACK);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.WHITE);
        g2.fill(new Rectangle2D.Double(0,0,20,20));
    }
}

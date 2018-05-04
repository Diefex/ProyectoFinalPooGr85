/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.gui;

import Juego.logica.Jugador;
import javax.swing.JFrame;

/**
 *
 * @author Diefex
 */
public class Juego extends JFrame {

    public Juego() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Jugador J = new Jugador();
        addKeyListener(J);
        setVisible(true);
    }
    
}

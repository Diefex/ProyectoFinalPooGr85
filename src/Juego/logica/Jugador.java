/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.logica;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Diefex
 */
public class Jugador implements KeyListener {
    
    int ID;
    int Puntaje;
    int Direccion;

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        Direccion = e.getKeyCode();
        switch (e.getKeyCode()) {
            case 38 :
                System.out.println("ARRIBA");
                break;
            case 37 :
                System.out.println("IZQUIERDA");
                break;
            case 39 :
                System.out.println("DERECHA");
                break;
            case 40 :
                System.out.println("ABAJO");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}

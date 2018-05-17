/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

/**
 *
 * @author Diefex
 */
public class Servidor {
    
    char[][] mapa;
    Enemigo enemigo;
    Jugador jugador;
    
    public void Servidor () {
        mapa = new char[31][31];
        enemigo = new Enemigo();
        jugador = new Jugador();
    }
    
    public void actualizarMatriz() {
        enemigo.mover();
        jugador.mover();
    }
    
}

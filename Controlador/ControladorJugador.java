package Dodgeball.Controlador;

import Dodgeball.Vista.Jugador;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControladorJugador implements KeyListener {
    private Jugador jugador;

    public ControladorJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        int moveSpeed = 5; // Velocidad de movimiento

        // Mover al jugador según las teclas presionadas
        if (key == KeyEvent.VK_D) {
            jugador.moverDerecha(moveSpeed);
        } else if (key == KeyEvent.VK_A) {
            jugador.moverIzquierda(moveSpeed);
        } else if (key == KeyEvent.VK_W) {
            jugador.moverArriba(moveSpeed);
        } else if (key == KeyEvent.VK_S) {
            jugador.moverAbajo(moveSpeed);
        }

        
        jugador.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // No se usa en este caso
    }
}

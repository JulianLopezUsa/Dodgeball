package Dodgeball.Controlador;

import Dodgeball.Vista.Jugador;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControladorJugador implements KeyListener {
    private Jugador jugador;
    private Runnable repaintCallback; // Nuevo campo para referenciar al método repaint

    public ControladorJugador(Jugador jugador, Runnable repaintCallback) {
        this.jugador = jugador;
        this.repaintCallback = repaintCallback;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // No se usa en este caso
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        int moveSpeed = 5; // Velocidad de movimiento

        // Mover el jugador según las teclas presionadas
        if (key == KeyEvent.VK_LEFT) {
            jugador.setX(jugador.getX() - moveSpeed);
        } else if (key == KeyEvent.VK_RIGHT) {
            jugador.setX(jugador.getX() + moveSpeed);
        } else if (key == KeyEvent.VK_UP) {
            jugador.setY(jugador.getY() - moveSpeed);
        } else if (key == KeyEvent.VK_DOWN) {
            jugador.setY(jugador.getY() + moveSpeed);
        }

        repaintCallback.run(); // Volver a dibujar el tablero
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // No se usa en este caso
    }
}

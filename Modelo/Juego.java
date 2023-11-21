package Modelo;


import javax.swing.*;

import Vista.Tablero;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Juego extends JFrame implements ActionListener {
    private Tablero tablero;
    private JButton botonJugador1;
    private JButton botonJugador2;
    private int puntuacionJugador1;
    private int puntuacionJugador2;

    public Juego() {
  
        // Inicialización del tablero
        tablero = new Tablero();

        // Añadir componentes al contenedor principal
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(tablero, BorderLayout.CENTER);


        // Inicialización de puntuaciones
        puntuacionJugador1 = 1;
        puntuacionJugador2 = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonJugador1) {
            puntuacionJugador1++;
        } else if (e.getSource() == botonJugador2) {
            puntuacionJugador2++;
        }

        // Actualizar marcador en el tablero
        tablero.setMarcador(puntuacionJugador1, puntuacionJugador2);
        tablero.repaint(); // Volver a dibujar el tablero
    }

}


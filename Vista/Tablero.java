package Dodgeball.Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


import javax.swing.JPanel;

public class Tablero extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        int anchoPanel = getWidth();
        int altoPanel = getHeight();

        // Limpiar el panel
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, anchoPanel, altoPanel);

        g.setColor(Color.BLACK);
        int anchoRectangulo = 1200;
        int altoRectangulo = 700;
        int xRectangulo = (anchoPanel - anchoRectangulo) / 2;
        int yRectangulo = (altoPanel - altoRectangulo) / 2;
        g.drawRect(xRectangulo, yRectangulo, anchoRectangulo, altoRectangulo);

        int xLinea = anchoPanel / 2;
        g.drawLine(xLinea, yRectangulo, xLinea, yRectangulo + altoRectangulo);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 16));

        String etiquetaIzquierda = "Jugador 1";
        int xEtiquetaIzquierda = (anchoPanel - g.getFontMetrics().stringWidth(etiquetaIzquierda)) / 4;
        int yEtiquetaIzquierda = yRectangulo - 20;
        g.drawString(etiquetaIzquierda, xEtiquetaIzquierda, yEtiquetaIzquierda);

        String etiquetaDerecha = "Jugador 2";
        int xEtiquetaDerecha = (3 * anchoPanel + g.getFontMetrics().stringWidth(etiquetaDerecha)) / 4;
        int yEtiquetaDerecha = yRectangulo - 20;
        g.drawString(etiquetaDerecha, xEtiquetaDerecha, yEtiquetaDerecha);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        String etiquetaCentral = "6 : 6";
        int xEtiquetaCentral = (anchoPanel - g.getFontMetrics().stringWidth(etiquetaCentral)) / 2;
        int yEtiquetaCentral = yEtiquetaIzquierda;
        g.drawString(etiquetaCentral, xEtiquetaCentral, yEtiquetaCentral);

        int numJugadores = 6;
        int anchoJugador = 40;
        int altoJugador = 40;
        int espacioEntreJugadores = 10;
        int xInicialIzquierda = xRectangulo + 10;
        int yInicialIzquierda = yRectangulo + (altoRectangulo - (numJugadores * (altoJugador + espacioEntreJugadores))) / 2;

        for (int i = 0; i < numJugadores; i++) {
            int xJugador = xInicialIzquierda;
            int yJugador = yInicialIzquierda + i * (altoJugador + espacioEntreJugadores);
            g.setColor(Color.RED); 
            g.fillRect(xJugador, yJugador, anchoJugador, altoJugador);
        }

        int xInicialDerecha = xRectangulo + anchoRectangulo - anchoJugador - 10;
        int yInicialDerecha = yRectangulo + (altoRectangulo - (numJugadores * (altoJugador + espacioEntreJugadores))) / 2;

        for (int i = 0; i < numJugadores; i++) {
            int xJugador = xInicialDerecha;
            int yJugador = yInicialDerecha + i * (altoJugador + espacioEntreJugadores);
            g.setColor(Color.BLUE); 
            g.fillRect(xJugador, yJugador, anchoJugador, altoJugador);
        }

    }
}

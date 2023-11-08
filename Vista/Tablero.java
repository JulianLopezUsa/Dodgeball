package Dodgeball.Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Tablero extends JPanel {

    private Image backgroundImage;

    public Tablero() {
        try {
            backgroundImage = ImageIO.read(new File("Dodgeball/src/Imagenes/Cancha.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int anchoPanel = getWidth();
        int altoPanel = getHeight();

        // Llena el fondo del panel con un color blanco
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, anchoPanel, altoPanel);

        // Dibuja la imagen de fondo
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
        g.setColor(Color.BLACK);
        int anchoRectangulo = 1365;
        int altoRectangulo = 750;
        int xRectangulo = (anchoPanel - anchoRectangulo) / 2;
        int yRectangulo = (altoPanel - altoRectangulo) / 2;
        g.drawRect(xRectangulo, yRectangulo, anchoRectangulo, altoRectangulo);

        int xLinea = anchoPanel / 2;
        g.drawLine(xLinea, yRectangulo, xLinea, yRectangulo + altoRectangulo);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 25));


        // Nombre de los jugadores
        String etiquetaIzquierda = "Jugador 1";
        int xEtiquetaIzquierda = (anchoPanel - g.getFontMetrics().stringWidth(etiquetaIzquierda)) / 4;
        int yEtiquetaIzquierda = yRectangulo - 20;
        g.drawString(etiquetaIzquierda, xEtiquetaIzquierda, yEtiquetaIzquierda);

        String etiquetaDerecha = "Jugador 2";
        int xEtiquetaDerecha = (3 * anchoPanel + g.getFontMetrics().stringWidth(etiquetaDerecha)) / 4;
        int yEtiquetaDerecha = yRectangulo - 20;
        g.drawString(etiquetaDerecha, xEtiquetaDerecha, yEtiquetaDerecha);


        // Marcador
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 22));
        String etiquetaCentral = "6 : 6";
        int xEtiquetaCentral = (anchoPanel - g.getFontMetrics().stringWidth(etiquetaCentral)) / 2;
        int yEtiquetaCentral = yEtiquetaIzquierda;
        g.drawString(etiquetaCentral, xEtiquetaCentral, yEtiquetaCentral);


        // pintar jugadores
        int numJugadores = 6;
        int anchoJugador = 60;
        int altoJugador = 100;
        int espacioEntreJugadores = 10;
        int xInicialIzquierda = xRectangulo + 10;
        int yInicialIzquierda = yRectangulo
                + (altoRectangulo - (numJugadores * (altoJugador + espacioEntreJugadores))) / 2;


        Image imgJugadorIzquierdo = Toolkit.getDefaultToolkit().getImage("Dodgeball/src/Imagenes/Jugadores/Capa 1.png");

        for (int i = 0; i < numJugadores; i++) {
            int xJugador = xInicialIzquierda;
            int yJugador = yInicialIzquierda + i * (altoJugador + espacioEntreJugadores);
           
            g.drawImage(imgJugadorIzquierdo, xJugador, yJugador, anchoJugador, altoJugador, this);
        }

        int xInicialDerecha = xRectangulo + anchoRectangulo - anchoJugador - 10;
        int yInicialDerecha = yRectangulo
                + (altoRectangulo - (numJugadores * (altoJugador + espacioEntreJugadores))) / 2;

      
        Image imgJugadorDerecho = Toolkit.getDefaultToolkit().getImage("Dodgeball/src/Imagenes/Jugadores/Capa 2.png");

        for (int i = 0; i < numJugadores; i++) {
            int xJugador = xInicialDerecha;
            int yJugador = yInicialDerecha + i * (altoJugador + espacioEntreJugadores);
            // Dibuja la imagen en lugar del cuadro de color
            g.drawImage(imgJugadorDerecho, xJugador, yJugador, anchoJugador, altoJugador, this);
        }

    }
}

package Dodgeball.Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Dodgeball.Controlador.ControladorJugador;

public class Tablero extends JPanel {

    private Image backgroundImage;
    private Jugador jugador;
    private ControladorJugador controladorJugador;

    public Tablero() {

        jugador = new Jugador("ruta/a/tu/imagen/de/jugador.png", 100, 100);
        controladorJugador = new ControladorJugador(jugador, null);
        addKeyListener(controladorJugador);
        setFocusable(true);

        try {
            backgroundImage = ImageIO.read(new File("Dodgeball/src/Imagenes/Cancha.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        jugador.dibujar(g);

        int anchoPanel = getWidth();
        int altoPanel = getHeight();

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, anchoPanel, altoPanel);

        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
        g.setColor(Color.BLACK);
        int anchoRectangulo = 1180;
        int altoRectangulo = 577;
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

    }
}

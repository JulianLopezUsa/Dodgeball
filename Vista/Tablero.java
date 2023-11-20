package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
public class Tablero extends JPanel {

    private Image backgroundImage;

    private int puntuacionJugador1;
    private int puntuacionJugador2;
    private String nombreJugador1;
    private String nombreJugador2;

    public void setMarcador(int puntuacionJugador1, int puntuacionJugador2) {
        this.puntuacionJugador1 = puntuacionJugador1;
        this.puntuacionJugador2 = puntuacionJugador2;
    }

    public void setNombresJugadores(String nombreJugador1, String nombreJugador2) {
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }
  
    public Tablero() {
        try {
            backgroundImage = ImageIO.read(new File("Dodgeball/src/Imagenes/Cancha.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Constructor con parámetros para nombres de jugadores
    public Tablero(String nombreJugador1, String nombreJugador2) {
        try {
            backgroundImage = ImageIO.read(new File("Dodgeball/src/Imagenes/Cancha.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

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
        if (nombreJugador1 != null && nombreJugador2 != null) {
            int xEtiquetaIzquierda = (anchoPanel - g.getFontMetrics().stringWidth(nombreJugador1)) / 4;
            int yEtiquetaIzquierda = yRectangulo - 20;
            g.drawString(nombreJugador1, xEtiquetaIzquierda, yEtiquetaIzquierda);

            int xEtiquetaDerecha = (3 * anchoPanel + g.getFontMetrics().stringWidth(nombreJugador2)) / 4;
            int yEtiquetaDerecha = yRectangulo - 20;
            g.drawString(nombreJugador2, xEtiquetaDerecha, yEtiquetaDerecha);
        }

        // Marcador
        int yEtiquetaIzquierda = 0 ;
        String etiquetaCentral = puntuacionJugador1 + " : " + puntuacionJugador2;
        int xEtiquetaCentral = (anchoPanel - g.getFontMetrics().stringWidth(etiquetaCentral)) / 2;
        int yEtiquetaCentral = yEtiquetaIzquierda;
        g.drawString(etiquetaCentral, xEtiquetaCentral, yEtiquetaCentral);
    }
}

package Dodgeball.Vista;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Jugador {
    private Image imagenJugador;
    private int x;
    private int y;

    public Jugador(String rutaImagen, int x, int y) {
        try {
            imagenJugador = ImageIO.read(new File(rutaImagen));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.x = x;
        this.y = y;
    }

    public void dibujar(Graphics g) {
        if (imagenJugador != null) {
            g.drawImage(imagenJugador, x, y, null);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }
}

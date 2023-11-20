package Dodgeball.Vista;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Pelota {
    private Image imagenPelota;
    private int x;
    private int y;

    public Pelota(String rutaImagen, int x, int y) {
        try {
            imagenPelota = ImageIO.read(new File(rutaImagen));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.x = x;
        this.y = y;
    }

    public void dibujar(Graphics g) {
        if (imagenPelota != null) {
            g.drawImage(imagenPelota, x, y, null);
        }
    }

   
}

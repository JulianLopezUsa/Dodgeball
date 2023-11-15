package Dodgeball.Modelo;


public class Modelo {
    private int x;
    private int y;

    public Modelo() {
        // Configuración inicial de la posición de la imagen
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveImage(int dx, int dy) {
        x += dx;
        y += dy;
    }
}


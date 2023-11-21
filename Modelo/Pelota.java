package Modelo;

public class Pelota {
    private int x, y;
    private boolean agarrada;

    public Pelota(int x, int y) {
        this.x = x;
        this.y = y;
        this.agarrada = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isAgarrada() {
        return agarrada;
    }

    public void setAgarrada(boolean agarrada) {
        this.agarrada = agarrada;
    }

    public void setPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

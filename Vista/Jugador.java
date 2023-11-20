package Vista;

public class Jugador {
    private int x;
    private int y;
    private int velocidad;

    public Jugador(int x, int y, int velocidad) {
        this.x = x;
        this.y = y;
        this.velocidad = velocidad;
    }

    public Jugador(int i, int j) {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moverDerecha(int moveSpeed) {
        x += velocidad;
    }

    public void moverIzquierda(int moveSpeed) {
        x -= velocidad;
    }

    public void moverArriba(int moveSpeed) {
        y -= velocidad;
    }

    public void moverAbajo(int moveSpeed) {
        y += velocidad;
    }

    public void repaint() {
    }
}

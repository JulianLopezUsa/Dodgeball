package Controlador;


public class Pelota {
    private Pelota model;
    private Pelota view;

    public Pelota(Pelota model, Pelota view) {
        this.model = model;
        this.view = view;
    }

    public void iniciarJuego() {
        java.awt.EventQueue.invokeLater(() -> view.setVisible(true));
    }

    private Object setVisible(boolean b) {
        return null;
    }
}

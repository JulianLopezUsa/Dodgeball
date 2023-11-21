package Vista;

import javax.swing.*;


public class Pelota extends JFrame {
    private Pelota Pelota;

    public Pelota(Pelota Pelota) {
        this.Pelota = Pelota;

        setTitle("Juego");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

package Dodgeball.Vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Elegir {

    public void elegirp(JPanel panel) {
        panel.removeAll();


        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        panel.add(buttonPanel);

        JPanel panelJug1 = new JPanel();
        JPanel panelJug2 = new JPanel();

        panelJug1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelJug2.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton Jug1 = new JButton("Jugador 1");
        JButton Jug2 = new JButton("Jugador 2");

        panelJug1.add(Jug1);
        panelJug2.add(Jug2);

        buttonPanel.add(panelJug1);
        buttonPanel.add(panelJug2);

        Jug1.addActionListener(e -> {
            Tablero tablero = new Tablero();
            panel.removeAll();
            panel.add(tablero);
            panel.revalidate();
            panel.repaint();
        });

        Jug2.addActionListener(e -> {
            Tablero tablero = new Tablero();
            panel.removeAll();
            panel.add(tablero);
            panel.revalidate();
            panel.repaint();
        });

        // Draw a line between the two halves

        panel.add(Box.createVerticalStrut(140));
        panel.revalidate();
        panel.repaint();
    }
}

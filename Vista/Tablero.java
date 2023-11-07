package Dodgeball.Vista;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Elegir {

    public void elegirp(JPanel panel) {
        panel.removeAll();

        // Create a new panel with GridLayout to divide it into two halves
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

        // Add the new panel to the main panel
        panel.add(buttonPanel);

        // Create two sub-panels for each button
        JPanel panelJug1 = new JPanel();
        JPanel panelJug2 = new JPanel();

        // Set layout for each sub-panel to center the buttons
        panelJug1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelJug2.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Create the "Jugador 1" and "Jugador 2" buttons
        JButton Jug1 = new JButton("Jugador 1");
        JButton Jug2 = new JButton("Jugador 2");

        // Add labels above each button
        JLabel labelJug1 = new JLabel("Label Jugador 1");
        JLabel labelJug2 = new JLabel("Label Jugador 2");

        // Add the buttons and labels to their respective sub-panels
        panelJug1.add(labelJug1);
        panelJug1.add(Jug1);
        panelJug2.add(labelJug2);
        panelJug2.add(Jug2);

        // Add the sub-panels to the main panel
        buttonPanel.add(panelJug1);
        buttonPanel.add(panelJug2);

        // Add the action listeners to the buttons (same as before)

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

package Dodgeball.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

    public Menu() {
        // Configura la ventana
        setTitle("Dodgeball");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Etiqueta de título
        JLabel titulo = new JLabel("Dodgeball");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(titulo);

        // Botón para iniciar el juego
        JButton botonIniciar = new JButton("Iniciar Juego");
        botonIniciar.setAlignmentX(Component.CENTER_ALIGNMENT);
        botonIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Coloca aquí el código para iniciar el juego
                JOptionPane.showMessageDialog(null, "El juego se iniciará ahora.");
            }
        });
        panel.add(botonIniciar);

        // Botón para salir del juego
        JButton botonSalir = new JButton("Salir");
        botonSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(botonSalir);

        // Agrega el panel al marco
        add(panel);

        // Muestra la ventana
        setVisible(true);
    }

}

package Dodgeball.Vista;

import java.awt.Component;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


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
        panel.setAlignmentX(Component.CENTER_ALIGNMENT); // Centra el panel
    
        // Etiqueta de título
        JLabel titulo = new JLabel("Dodgeball");
        titulo.setFont(new Font("Arial", Font.BOLD, 90));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(titulo);
    
        // Botón para iniciar el juego
        JButton botonIniciar = new JButton("Iniciar Juego");
        JButton botonSalir = new JButton("Salir");
        botonIniciar.setAlignmentX(Component.CENTER_ALIGNMENT);
        botonSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
        botonIniciar.addActionListener(e -> {
            
            Elegir elegir = new Elegir();
            elegir.elegirp(panel, botonSalir);

        });
    
        panel.add(Box.createVerticalStrut(140)); 
        panel.add(botonIniciar);
        panel.add(Box.createVerticalStrut(10)); 
        panel.add(botonSalir);
    
        add(panel); 
    
        setVisible(true);
    }
    
}

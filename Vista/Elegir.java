package Vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Elegir extends JPanel {

    public void elegirp(JPanel panel) {

        panel.removeAll();

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        panel.add(buttonPanel);

        JPanel panelJug1 = new JPanel();
        JPanel panelJug2 = new JPanel();
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Panel para el botón del centro

        panelJug1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelJug2.setLayout(new FlowLayout(FlowLayout.CENTER));

        JTextField nJugador1 = new JTextField(10);
        JTextField nJugador2 = new JTextField(10);

        ImageIcon imagen1 = new ImageIcon("Dodgeball/src/Imagenes/Jugadores/Capa 1.png");
        JLabel etiqueta1 = new JLabel(imagen1);
        JLabel etiquetaNombre1 = new JLabel("Jugador 1:");

        ImageIcon imagen2 = new ImageIcon("Dodgeball/src/Imagenes/Jugadores/Capa 2.png");
        JLabel etiqueta2 = new JLabel(imagen2);
        JLabel etiquetaNombre2 = new JLabel("Jugador 2:");

        panelJug1.add(etiquetaNombre1);
        panelJug1.add(nJugador1);
        panelJug1.add(etiqueta1);

        panelJug2.add(etiquetaNombre2);
        panelJug2.add(nJugador2);
        panelJug2.add(etiqueta2);

        buttonPanel.add(panelJug1);
        buttonPanel.add(panelJug2);

        
        JButton boton = new JButton("Iniciar Juego");
        boton.addActionListener(this::centroButtonActionPerformed);
        centerPanel.add(boton);

        panel.add(centerPanel); 

        // Dibujar una línea entre las dos mitades
        panel.add(Box.createVerticalStrut(140));
        panel.revalidate();
        panel.repaint();
    }

    // Acción para el botón en el centro
    private void centroButtonActionPerformed(ActionEvent e) {
        // Acción al hacer clic en el botón del centro
        System.out.println("Botón en el centro ha sido presionado");
    }
}

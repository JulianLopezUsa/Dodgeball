package Dodgeball.Vista;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Elegir {
    public void elegirp(JPanel panel, JButton botonSalir) {
        panel.removeAll();

        // Agrega los nuevos componentes que deseas mostrar
        JButton nuevoBoton = new JButton("Nuevo Botón");
        nuevoBoton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(Box.createVerticalStrut(140)); // Espacio vertical entre la etiqueta y el botón
        panel.add(nuevoBoton);

        // Valida y repinta el panel
        panel.revalidate();
        panel.repaint();
    }
}

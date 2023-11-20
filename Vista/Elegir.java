package Vista;


import java.awt.FlowLayout;
import java.awt.GridLayout;
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

        panelJug1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelJug2.setLayout(new FlowLayout(FlowLayout.CENTER));

        JTextField nJugador1 = new JTextField(10);
        JButton Jug1 = new JButton("Jugador 1");
        JTextField nJugador2 = new JTextField(10);
        JButton Jug2 = new JButton("Jugador 2");

        ImageIcon imagen1 = new ImageIcon("Dodgeball/src/Imagenes/Jugadores/Capa 1.png");
        JLabel etiqueta1 = new JLabel(imagen1);

        ImageIcon imagen2 = new ImageIcon("Dodgeball/src/Imagenes/Jugadores/Capa 2.png");
        JLabel etiqueta2 = new JLabel(imagen2);

        panelJug1.add(nJugador1);
        panelJug1.add(Jug1);
        panelJug1.add(etiqueta1);

        panelJug2.add(nJugador2);
        panelJug2.add(Jug2);
        panelJug2.add(etiqueta2);

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

        // Dibujar una línea entre las dos mitades
        panel.add(Box.createVerticalStrut(140));
        panel.revalidate();
        panel.repaint();
    }

}

package Dodgeball.Vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Tablero extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();


        g.setColor(Color.WHITE);
        g.fillRect(0, 0, panelWidth, panelHeight);

    
        g.setColor(Color.BLACK);
        int rectWidth = 1200; 
        int rectHeight = 700; 
        int rectX = (panelWidth - rectWidth) / 2;
        int rectY = (panelHeight - rectHeight) / 2;
        g.drawRect(rectX, rectY, rectWidth, rectHeight);

        int lineX = panelWidth / 2;
        g.drawLine(lineX, rectY, lineX, rectY + rectHeight);
    }
}

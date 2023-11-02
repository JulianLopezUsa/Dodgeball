package Dodgeball.launcher;

import javax.swing.SwingUtilities;

import Dodgeball.Vista.Menu;

public class Launcher {
    
  public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Menu();
            }
        });
    }

}

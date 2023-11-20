package launcher;

import javax.swing.SwingUtilities;

import Vista.Menu;

public class Launcher {
    
  public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Menu();
            }
        });
    }

}

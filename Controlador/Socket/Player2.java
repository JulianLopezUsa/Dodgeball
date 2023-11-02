package Dodgeball.Controlador.Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Player2 {

    public static void main(String[] args) {
        
        final String HOST="127.0.0.1";
        final int PUERTO = 5000;
        DataInputStream in;
        DataOutputStream out ;
        
        
        try {

            Socket sc = new Socket(HOST,PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            out.writeUTF("Hola Soy player2");
            String mensaje = in.readUTF();
            System.out.println(mensaje);

            sc.close();

            
        } catch (Exception ex) {
            Logger.getLogger(Player2.class.getName()).log(Level.SEVERE,null,ex);
        }

    }
 

    
    

}

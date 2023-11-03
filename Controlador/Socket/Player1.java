package Dodgeball.Controlador.Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Player1 {

    public static void main(String[] args) {
        ServerSocket player1 = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;

        final int PUERTO = 5000;

        try {

            player1 = new ServerSocket(PUERTO);
            System.out.println("Servidor conectado");

            while (true) {
                sc = player1.accept();
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                String mensaje = in.readUTF();

                System.out.println(mensaje);

                out.writeUTF("Hola player1");
                sc.close();

                System.out.println("Cliente desconectado");

            }
        } catch (Exception ex) {
            Logger.getLogger(Player1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
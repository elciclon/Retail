package Logic;

import Sockets.Client;
import java.io.IOException;

public class RetailBox2 {

    public static void main(String[] args) throws IOException{
        Client client = new Client();
        System.out.println("Iniciando cliente...");
        client.startClient();
    }
    
}
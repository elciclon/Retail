package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;

public class Client extends ConexionSockets {
    public Client() throws IOException{
        super("client");
    }
        
    
    public void startClient() {
        try{
            serverOut = new DataOutputStream(clientSocket.getOutputStream());
            serverOut.writeUTF("Nuevo turno solicitado");
            clientSocket.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
        

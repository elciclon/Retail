package Sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Server extends ConexionSockets{
    private int counter;
    
    public Server() throws IOException{
        super("server");
    }
    
    public void startServer(){
        try{
            System.out.println("Esperando una conexión... ");
            clientSocket = serverSocket.accept();
            
            System.out.println("Cliente en línea");
            counter++;
            System.out.println("Turno número: " + counter);
            
            clientOut = new DataOutputStream(clientSocket.getOutputStream());
            clientOut.writeUTF("Petición recibida y aceptada");
            
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            
            while((serverMsj = input.readLine()) != null){
                System.out.println(serverMsj);
        }
            System.out.println("Fin de la conexión");
            serverSocket.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
                    
        }
    }
    
}

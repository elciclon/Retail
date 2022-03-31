package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ConexionSockets {
    private final int port = 8080;
    private final String host = "localhost";
    protected String serverMsj;
    protected ServerSocket serverSocket;
    protected Socket clientSocket;
    protected DataOutputStream serverOut, clientOut;
    
    public ConexionSockets(String type) throws IOException {
        if (type.equalsIgnoreCase("server")){
            serverSocket = new ServerSocket(port);
            clientSocket = new Socket();
        }
        else {
            clientSocket = new Socket(host, port);
        }
    }
    
}

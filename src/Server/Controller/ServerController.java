package Server.Controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerController {
    Socket socket;
    public ServerController(Socket socket){
        this.socket = socket;
    }
}

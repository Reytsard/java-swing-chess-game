package Server.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerController {
    Socket socket;
    public ServerController(Socket socket){
        this.socket = socket;
    }
    /**
     * Todo: Create a queuing system for the chess players that will connect them with each other and play
     */
}

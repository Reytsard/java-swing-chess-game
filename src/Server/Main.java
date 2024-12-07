package Server;

import Server.Controller.ServerController;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        Main program;
        try{
            program = new Main();
            program.run();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void run(){
        int port = 2000;
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            while(true){
                Socket s = serverSocket.accept();
                new ServerController(s);
            }
        }catch ( IOException e){
            e.printStackTrace();
        }
    }
}

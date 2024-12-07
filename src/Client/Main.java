package Client;

import Client.Controller.ChessGameController;

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
        new ChessGameController();
    }
}

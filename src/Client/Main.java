package Client;

import Client.Controller.ChessGameController;

import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main program;
        try {
            program = new Main();
            program.consoleRun();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        new ChessGameController();
    }

    public void consoleRun() {
        System.out.println("Welcome to the chess");
        System.out.println();
        String[][] chessboard = {
                {"bR", "bB", "bKn", "bQ", "bK", "bKn", "bB", "bR"},
                {"bP", "bP", "bP", "bP", "bP", "bP", "bP", "bP"},
                {"-", "-", "-", "-", "-", "-", "-", "-",},
                {"-", "-", "-", "-", "-", "-", "-", "-",},
                {"-", "-", "-", "-", "-", "-", "-", "-",},
                {"-", "-", "-", "-", "-", "-", "-", "-",},
                {"wP", "wP", "wP", "wP", "wP", "wP", "wP", "wP"},
                {"wR", "wB", "wKn", "wQ", "wK", "wKn", "wB", "wR"},
        };
        boolean isPlaying = true;
        while (isPlaying) {
            displayBoard(chessboard);
//            System.out.println(chessboard[7][1]);
            String response = getResponse();
            validateResponseAndMove(response, chessboard);
            System.out.println("press f to quit / C to continue: ");
            if (scanner.nextLine().charAt(0) == 'f') isPlaying = false;
        }
    }

    private void validateResponseAndMove(String response, String[][] chessboard) {
        String[] responseArr = response.split("\\|");
        String squareToMove = responseArr[0];
        String squareToPlace = responseArr[1];

        String[] squareToMoveArr = squareToMove.split("");
        int row = letterRowToNumber(squareToMoveArr[0]) - 1;
        int col = Integer.parseInt(squareToMoveArr[1]);

        String[] squareToPlaceArr = squareToPlace.split("");
        int rowToPlace = letterRowToNumber(squareToPlaceArr[0]) - 1;
        int colToPlace = Integer.parseInt(squareToPlaceArr[1]);

        //todo: create swapping for pieces
        //no validation yet

        String temp = chessboard[colToPlace][ rowToPlace];
        chessboard[colToPlace][ rowToPlace] = chessboard[col][row];
        chessboard[col][row] = temp;

    }

    private int letterRowToNumber(String s) {
        if (s == "a") {
            return 1;
        } else if (s == "b") {
            return 2;
        } else if (s == "c") {
            return 3;
        } else if (s == "d") {
            return 4;
        } else if (s == "e") {
            return 5;
        } else if (s == "f") {
            return 6;
        } else if (s == "g") {
            return 7;
        }
        return 8;
    }

    private String getResponse() {
        System.out.println("What is your move? Type the square you want to move.");
        String pieceToMove = scanner.nextLine();
        System.out.println("Where you do want to move your piece?");
        String locationToMovePiece = scanner.nextLine();
        return pieceToMove + "|" + locationToMovePiece;
    }

    public void displayBoard(String[][] board) {
        for (String[] stringArr : board) {
            for (String element : stringArr) {
                System.out.printf("%-4s", element);
            }
            System.out.println();
        }
    }
}

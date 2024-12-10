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
                {"wR", "wB", "wKn", "wQ", "wK", "wKn", "wB", "wR"},
                {"wP", "wP", "wP", "wP", "wP", "wP", "wP", "wP"},
                {"-", "-", "-", "-", "-", "-", "-", "-",},
                {"-", "-", "-", "-", "-", "-", "-", "-",},
                {"-", "-", "-", "-", "-", "-", "-", "-",},
                {"-", "-", "-", "-", "-", "-", "-", "-",},
                {"bP", "bP", "bP", "bP", "bP", "bP", "bP", "bP"},
                {"bR", "bB", "bKn", "bQ", "bK", "bKn", "bB", "bR"},
        };
        boolean isPlaying = true;
        while (isPlaying) {
            displayBoard(chessboard);
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

//        String[] squareToMoveArr = squareToMove.split("");
//        int col = letterRowToNumber(squareToMoveArr[0]) - 1;
//        int row = Integer.parseInt(squareToMoveArr[1]);
//
//        String[] squareToPlaceArr = squareToPlace.split("");
//        int colToPlace = letterRowToNumber(squareToPlaceArr[0]) - 1;
//        int rowToPlace = Integer.parseInt(squareToPlaceArr[1]);

        //todo: create swapping for pieces
        //no validation yet

//        String temp = chessboard[rowToPlace][colToPlace ];
//        chessboard[rowToPlace][colToPlace ] = chessboard[row][col];
//        chessboard[row][col] = temp;

    }

    private int letterRowToNumber(String s) {
        if (s.compareToIgnoreCase("a") == 0) {
            return 1;
        } else if (s.compareToIgnoreCase("b") == 0) {
            return 2;
        } else if (s.compareToIgnoreCase("c") == 0) {
            return 3;
        } else if (s.compareToIgnoreCase("d") == 0) {
            return 4;
        } else if (s.compareToIgnoreCase("e") == 0) {
            return 5;
        } else if (s.compareToIgnoreCase("f") == 0) {
            return 6;
        } else if (s.compareToIgnoreCase("g") == 0) {
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
        for (int i = board.length - 1; i>= 0; i--) {
            System.out.printf("%-4d", i+1);
            for (int j = 0; j<board[i].length;j++) {
                System.out.printf("%-4s", board[i][j]);
            }
            System.out.println();
        }
        System.out.printf("%-4s%-4s%-4s%-4s%-4s%-4s%-4s%-4s%-4s\n","x","a","b","c","d","e","f","g","h");
    }
}

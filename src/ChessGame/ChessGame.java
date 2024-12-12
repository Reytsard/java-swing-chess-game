package ChessGame;

import Client.Model.*;

import java.util.Arrays;
import java.util.Scanner;

public class ChessGame {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ChessPiece[][] chessboard = {
                createRowForBackRanks("white"),
                createRowForPawns("white"),
                createRowForNulls(),
                createRowForNulls(),
                createRowForNulls(),
                createRowForNulls(),
                createRowForPawns("black"),
                createRowForBackRanks("black"),
        };
        boolean isInGame = true;
        while (isInGame) {
            displayBoard(chessboard);
            String fromNotation = askResponse();
            String toNotation = askResponse();
            validateMove(fromNotation, toNotation);
            isInGame = !isInGame;
        }
    }

    private static void validateMove(String fromNotation, String toNotation) {

    }

    private static String askResponse() {
        String response = scanner.nextLine();
        while (response.length() != 2) {
            System.out.println("Input wrong");
            System.out.println("Again.");
            System.out.print("Input: ");
            response = scanner.nextLine();
        }
        return response;
    }

    public static void displayBoard(ChessPiece[][] board) {
        for (int i = board.length - 1; i >= 0; i--) {
            System.out.printf("%-4d", i + 1);
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == null){
                    System.out.printf("%-4s", "-");

                }else{
                    System.out.printf("%-4s", board[i][j]);

                }
            }
            System.out.println();
        }
        System.out.printf("%-4s%-4s%-4s%-4s%-4s%-4s%-4s%-4s%-4s\n", "x", "a", "b", "c", "d", "e", "f", "g", "h");
    }

    private static ChessPiece[] createRowForNulls() {
        return new ChessPiece[]{null, null, null, null, null, null, null, null};
    }

    private static ChessPiece[] createRowForPawns(String color) {
        ChessPiece[] row = new ChessPiece[8];
        for (int i = 0; i < 8; i++) {
            row[i] = new Pawn(color, 1, "p");
        }
        return row;
    }

    private static ChessPiece[] createRowForBackRanks(String color) {
        ChessPiece[] row = new ChessPiece[8];
        row[0] = new Rook(color, 5, "R");
        row[1] = new Knight(color, 3, "N");
        row[2] = new Bishop(color, 3, "B");
        row[3] = new Queen(color, 8, "Q");
        row[4] = new King(color, 4444, "K");
        row[5] = new Bishop(color, 3, "B");
        row[6] = new Knight(color, 3, "N");
        row[7] = new Rook(color, 5, "R");
        return row;
    }
}

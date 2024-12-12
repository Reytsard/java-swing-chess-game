package Client.Controller;

import Client.Model.*;
import Client.View.ChessBoardView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ChessGameController {
    boolean isplayer1Turn = true;
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

    public ChessGameController() {
        //todo: possible way to check for another player
        //todo: if there is a person, we start a game.
    }

    private void changeTurn() {
        isplayer1Turn = !isplayer1Turn;
    }

    private ChessPiece[] createRowForNulls() {
        return new ChessPiece[]{null, null, null, null, null, null, null, null};
    }

    private ChessPiece[] createRowForPawns(String color) {
        ChessPiece[] row = new ChessPiece[8];
        for (int i = 0; i < 8; i++) {
            row[i] = new Pawn(color, 1, "p");
        }
        return row;
    }

    private ChessPiece[] createRowForBackRanks(String color) {
        ChessPiece[] row = new ChessPiece[8];
        row[0] = new Rook(color, 5, "R");
        row[1] = new Knight(color, 3, "Kn");
        row[2] = new Bishop(color, 3, "B");
        row[3] = new Queen(color, 8, "Q");
        row[4] = new King(color, 4444, "K");
        row[5] = new Bishop(color, 3, "B");
        row[6] = new Knight(color, 3, "Kn");
        row[7] = new Rook(color, 5, "R");
        return row;
    }


}

package Client.Model;

public class ChessLayout {
    ChessPiece[][] chessboard;

    //white pieces
    ChessPiece whiteRook;
    ChessPiece whiteRook2;
    ChessPiece whiteKnight;
    ChessPiece whiteKnight2;
    ChessPiece whiteBishop;
    ChessPiece whiteBishop2;
    ChessPiece whiteKing;
    ChessPiece whiteQueen;
    ChessPiece whitePawn;
    ChessPiece whitePawn2;
    ChessPiece whitePawn3;
    ChessPiece whitePawn4;
    ChessPiece whitePawn5;
    ChessPiece whitePawn6;
    ChessPiece whitePawn7;
    ChessPiece whitePawn8;

    //black pieces
    ChessPiece blackRook;
    ChessPiece blackRook2;
    ChessPiece blackKnight;
    ChessPiece blackKnight2;
    ChessPiece blackBishop;
    ChessPiece blackBishop2;
    ChessPiece blackKing;
    ChessPiece blackQueen;
    ChessPiece blackPawn;
    ChessPiece blackPawn2;
    ChessPiece blackPawn3;
    ChessPiece blackPawn4;
    ChessPiece blackPawn5;
    ChessPiece blackPawn6;
    ChessPiece blackPawn7;
    ChessPiece blackPawn8;

    public ChessLayout() {
        chessboard = new ChessPiece[8][8];
        instantiatePieces();
    }

    private void instantiatePieces() {
        instantiateWhitePieces();
        instantiateBlackPieces();
        placePiecesInTheArray();
    }

    private void placePiecesInTheArray() {
        chessboard[0][0] = blackRook;
        chessboard[0][1] = blackKnight;
        chessboard[0][2] = blackBishop;
        chessboard[0][3] = blackKing;
        chessboard[0][4] = blackQueen;
        chessboard[0][5] = blackBishop2;
        chessboard[0][6] = blackKnight2;
        chessboard[0][7] = blackRook2;
        chessboard[1][0] = blackPawn;
        chessboard[1][1] = blackPawn2;
        chessboard[1][2] = blackPawn3;
        chessboard[1][3] = blackPawn4;
        chessboard[1][4] = blackPawn5;
        chessboard[1][5] = blackPawn6;
        chessboard[1][6] = blackPawn7;
        chessboard[1][7] = blackPawn8;

        chessboard[7][0] = whiteRook;
        chessboard[7][1] = whiteKnight;
        chessboard[7][2] = whiteBishop;
        chessboard[7][3] = whiteQueen;
        chessboard[7][4] = whiteKing;
        chessboard[7][5] = whiteBishop2;
        chessboard[7][6] = whiteKnight2;
        chessboard[7][7] = whiteRook2;
        chessboard[6][0] = whitePawn;
        chessboard[6][1] = whitePawn2;
        chessboard[6][2] = whitePawn3;
        chessboard[6][3] = whitePawn4;
        chessboard[6][4] = whitePawn5;
        chessboard[6][5] = whitePawn6;
        chessboard[6][6] = whitePawn7;
        chessboard[6][7] = whitePawn8;

    }

    private void instantiateWhitePieces() {
        whiteRook = new ChessPiece("Rook", 5, "a1");
        whiteRook2 = new ChessPiece("Rook", 5, "h1");
        whiteKnight = new ChessPiece("Knight", 3, "b1");
        whiteKnight2 = new ChessPiece("Knight", 3, "g1");
        whiteBishop = new ChessPiece("Bishop", 3, "c1");
        whiteBishop2 = new ChessPiece("Bishop", 3, "f1");
        whiteKing = new ChessPiece("King", 200, "d1");
        whiteQueen = new ChessPiece("Queen", 9, "e1");
        whitePawn = new ChessPiece("Pawn", 1, "a2");
        whitePawn2 = new ChessPiece("Pawn", 1, "b2");
        whitePawn3 = new ChessPiece("Pawn", 1, "c2");
        whitePawn4 = new ChessPiece("Pawn", 1, "d2");
        whitePawn5 = new ChessPiece("Pawn", 1, "e2");
        whitePawn6 = new ChessPiece("Pawn", 1, "f2");
        whitePawn7 = new ChessPiece("Pawn", 1, "g2");
        whitePawn8 = new ChessPiece("Pawn", 1, "h2");
    }
    private void instantiateBlackPieces(){
        blackRook = new ChessPiece("Rook", 5, "a8");
        blackRook2 = new ChessPiece("Rook", 5, "h8");
        blackKnight = new ChessPiece("Knight", 3, "b8");
        blackKnight2 = new ChessPiece("Knight", 3, "g8");
        blackBishop = new ChessPiece("Bishop", 3, "c8");
        blackBishop2 = new ChessPiece("Bishop", 3, "f8");
        blackKing = new ChessPiece("King", 200, "d8");
        blackQueen = new ChessPiece("Queen", 9, "e8");
        blackPawn = new ChessPiece("Pawn", 1, "a7");
        blackPawn2 = new ChessPiece("Pawn", 1, "b7");
        blackPawn3 = new ChessPiece("Pawn", 1, "c7");
        blackPawn4 = new ChessPiece("Pawn", 1, "d7");
        blackPawn5 = new ChessPiece("Pawn", 1, "e7");
        blackPawn6 = new ChessPiece("Pawn", 1, "f7");
        blackPawn7 = new ChessPiece("Pawn", 1, "g7");
        blackPawn8 = new ChessPiece("Pawn", 1, "h7");
    }
}

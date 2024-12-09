package Client.Model;

public interface ChessMovesInterface {
    void move(ChessPiece piece);
    ChessPiece capture(ChessPiece otherPiece);
}

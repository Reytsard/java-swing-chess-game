package Client.Model;

import javax.swing.*;

public class ChessBox extends JPanel {
    private int row;
    private int col;
    private ChessPiece piece;

    public ChessBox(int row, int col){
        super();
        this.row = row;
        this.col = col;
    }
    public void setPiece(ChessPiece piece){
        this.piece = piece;
    }
    public void removePiece(){
        this.piece = null;
    }
}

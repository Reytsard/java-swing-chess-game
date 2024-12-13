package Client.Model;

import java.util.ArrayList;

public class Pawn extends ChessPiece {
    private boolean isFirstMove = true;

    public Pawn(String color, int value, String annotation, int col, int row) {
        super(color, value, annotation, col, row);
    }

    @Override
    boolean move() {
        return false;
    }

    @Override
    ArrayList<String> getValidMoves(ChessPiece[][] chessboard) {
        ArrayList<String> validMoves = new ArrayList<>();
        int row = getRow();
        if (isFirstMove) {
            int col = getCol();
            //checks if piece is what color
            if(getColor().compareToIgnoreCase("white") == 0){
                col += 2;
            }else{
                col -= 2;
            }




            if (chessboard[col][row] == null && (col > 8 || col < 0)) {
                try {
                    validMoves.add(numberToLetter(col) + "" + row);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } else {
            int col = getCol();
            if (getColor() != "black") {
                col += 1;
            } else {
                col -= 1;
            }

            if (chessboard[col][row] != null && col > 8 || chessboard[col][row] != null && col < 0) {
                try {
                    validMoves.add(numberToLetter(col) + "" + row);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }


        return validMoves;
    }

    private String numberToLetter(int col) throws Exception {
        return switch (col) {
            case 0 -> "a";
            case 1 -> "b";
            case 2 -> "c";
            case 3 -> "d";
            case 4 -> "e";
            case 5 -> "f";
            case 6 -> "g";
            case 7 -> "h";
            default -> throw new Exception("no value");
        };
    }

}

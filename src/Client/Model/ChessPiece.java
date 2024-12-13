package Client.Model;

import java.util.ArrayList;

public abstract class ChessPiece  {
    private String color;
    private String annotation;
    private int value;
    private int col;
    private int row
    public ChessPiece(){
        color = "white";
        annotation = "";
        value = 0;
        col = 0;
        row = 0;
    }
    public ChessPiece(String name, int value, String annotation, int col, int row){
        this.color = name;
        this.value = value;
        this.annotation = annotation;
        this.col = col;
        this.row = row;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String name) {
        this.color = name;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString(){
        return annotation;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    abstract boolean move();
    abstract ArrayList<String> getValidMoves(ChessPiece[][] chessboard);
}

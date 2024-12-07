package Client.Model;

public class ChessPiece  {
    private String name;
    private String annotation;
    private int value;
    public ChessPiece(){
        name = "";
        annotation = "";
        value = 0;
    }
    public ChessPiece(String name, int value, String annotation){
        this.name = name;
        this.value = value;
        this.annotation = annotation;
    }
}

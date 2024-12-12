package Client.Model;

public class ChessPiece  {
    private String color;
    private String annotation;
    private int value;
    public ChessPiece(){
        color = "white";
        annotation = "";
        value = 0;
    }
    public ChessPiece(String name, int value, String annotation){
        this.color = name;
        this.value = value;
        this.annotation = annotation;
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
}

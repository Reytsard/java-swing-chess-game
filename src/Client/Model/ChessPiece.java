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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

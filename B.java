public class B {
    private String x;
    private int y;
    // Constructor vacio
    public B() {}
    // Constructor con atributos
    public B(String x, int y) {
        this.x = x;
        this.y = y;
    }
    // Getters y Setters
    public String getX() {return x;}
    public int getY() {return y;}
    public void setX(String x) {this.x = x;}
    public void setY(int y) {this.y = y;}

    @Override
    public String toString() {
        String h = "x: " + this.x + ", y: " + this.y;
        return h;
    }
}
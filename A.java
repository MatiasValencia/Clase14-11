public class A {
    private int x;
    private int y;
    // Constructor vacio
    public A() {}
    // Constructor con atributos
    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Getters y Setters
    public int getX() {return x;}
    public int getY() {return y;}
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}

    @Override
    public String toString() {
        String h = "x: " + this.x + ", y: " + this.y;
        return h;
    }
}
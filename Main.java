import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<A> listaA = new ArrayList<A>();  // ArrayList con objetos A
        // Objetos A
        listaA.add(new A(5,7));
        listaA.add(new A(12,4));
        listaA.add(new A(2,9));
        listaA.add(new A(13,2));
        listaA.add(new A(16,9));

        ArrayList<B> listaB = new ArrayList<B>(); // ArrayList con objetos B
        // Objetos B
        listaB.add(new B("4", 12));
        listaB.add(new B("6", 1));
        listaB.add(new B("15", 22));
        listaB.add(new B("2", 7));
        listaB.add(new B("8", 4));

        A a2 = (A) listaA.get(0).clone();
        System.out.println(a2.toString());
    }
}
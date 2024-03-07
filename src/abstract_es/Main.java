package abstract_es;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(3,4);
        System.out.println(rettangolo1.calculateArea());
        Triangolo triangolo1 = new Triangolo(5,6);
        System.out.println(triangolo1.calculateArea());
    }
}

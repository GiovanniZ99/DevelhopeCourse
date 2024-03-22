package java_basic;
/* Scrivere uno snippet di codice che dati 2 numeri con la
virgola(double) li sommi e li stampi senza virgola (int). */
public class es_castingfac {
    public static void main(String[] args) {


        double x = 5.5;

        double y = 10.10;
        int result = (int) (x + y);

        System.out.println(result);
    }
}

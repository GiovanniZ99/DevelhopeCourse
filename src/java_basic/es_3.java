package java_basic;

// Definire una funzione che accetti in ingresso una stringa e ne restituisca la lunghezza
public class es_3 {
    public static void main(String[] args) {
        String hello = "hello";
        System.out.println("la lunghezza della stringa è:");
        System.out.println(length(hello));
    }

    public static int length(String a) {
        return a.length();
    }
}

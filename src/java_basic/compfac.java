package java_basic;

/* Scrivi un programma che contiene un metodo che che confronti due numeri interi
e determini se sono diversi.Il programma dovrà stampare a video i due valori e il
risultato dell'eguaglianza. */
public class compfac {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println(a);
        System.out.println(b);
        System.out.println(comp(a, b));
    }

    public static boolean comp(char a, char b) {
        return a == b;
    }
}

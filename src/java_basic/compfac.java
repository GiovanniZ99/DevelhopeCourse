package java_basic;

/* Scrivi un programma che contiene un metodo che confronti
due caratteri e determini se sono diversi. Il programma dovrà stampare a video
i due caratteri e il risultato dell'eguaglianza. */
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

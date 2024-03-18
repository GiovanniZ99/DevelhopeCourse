package java_basic;

/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
e stampa tutti i numeri fino al valore immesso,
la stampa dovrà interrompersi se il valore è uguale a 5.*/
public class es_9 {
    public static void main(String[] args) {
        int a = 5;
        numbers(a);
    }

    public static void numbers(int x) {
        for (int i = 0; i <= x; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
    }
}

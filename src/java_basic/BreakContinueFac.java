package java_basic;
/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e
stampa tutti i numeri fino al valore immesso, la stampa dovrà saltare il valore uguale a 5.*/

public class BreakContinueFac {
    public static void main(String[] args) {
        int a = 7;
        numbers(a);
    }

    public static void numbers(int x) {
        for (int i = 0; i <= x; i++) {

            if (i == 5) {
                continue;
            }else{

                System.out.println(i);

            }
        }
    }
}


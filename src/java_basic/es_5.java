package java_basic;

/*Scrivi un programma che contiene un metodo che confronti due numeri interi
e determini se sono diversi.
Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza.*/
public class es_5 {
    public static void main(String[] args) {
        int numb_1=5;
        int numb_2=6;
        System.out.println(comp(numb_1,numb_2));

    }
    static boolean comp(int a, int b){
        System.out.println("il primo numero è " + a);
        System.out.println("il secondo numero è " + b);
        System.out.println("il risultato è ");
        return a!=b;



    }
}

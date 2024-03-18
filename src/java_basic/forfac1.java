package java_basic;/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e
restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.*/

public class forfac1 {
    public static void main(String[] args) {
        int x = 2;

        tab(x);
    }

    public static void tab(int x) {
        System.out.println("0");
        for (int i = 1; i < 11; i++) {
            int result = x * i;
            System.out.println(result);


        }


    }
}

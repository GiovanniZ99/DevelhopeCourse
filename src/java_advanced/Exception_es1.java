/*Scrivere una funzione che controlli se un numero int è in un determinato range.
Se lo, è ritorna true ; se non lo è, lancia un'eccezione.*/

package java_advanced;

import java.util.Scanner;

public class Exception_es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero su cui effetuare la verifica " +
                "del numero nel range [50, 100]: ");
        int inputNum = scanner.nextInt();
        try {
            System.out.println(rangeOfInt(inputNum));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean rangeOfInt(int num) {
        if ((num <= 100 && num >= 50)) {
            return true;
        } else{
            throw new IllegalArgumentException("il numero non è compreso");
        }

    }
}

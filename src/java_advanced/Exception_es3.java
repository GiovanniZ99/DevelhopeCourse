/*Scrivere una funzione che provi a dividere un numero per 0
e catturi l'eccezione leggendone il messaggio*/
package java_advanced;

import java.util.Scanner;

public class Exception_es3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numeratore: ");
        int numeratore = scanner.nextInt();
        System.out.print("Inserisci il denominatore: ");
        int denominatore = scanner.nextInt();
        try {
            Div(numeratore, denominatore);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }

    }

    public static void Div(int num, int den) {

        if(den!=0){
            int result = num/den;
            System.out.println(result);

        }else{
            throw new ArithmeticException("Non puoi dividere un numero per 0");
        }

    }
}

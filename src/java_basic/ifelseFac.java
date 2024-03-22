package java_basic;
/*Scrivere un programma che stampi i numeri da 1 a 100. Per i multipli di 3 stampi
"Fizz" al posto del numero e per i multipli di 5 stampi "Buzz".
Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".*/
public class ifelseFac {
    public static void main(String[] args) {
        String tre = "freeze";
        String cinque = "buzz";
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            System.out.println(value(i));
        }

    }

    public static String value(int x) {
        String empty = "";

        if ((x % 3 == 0) && (x % 5 == 0)) {
            empty = "freezebuzz";
        } else if (x % 3 == 0) {
            empty = "freeze";
        } else if (x % 5 == 0) {
            empty = "buzz";
        }
        return empty;
    }
}




package java_basic;

import java.util.Scanner;

/*Scrivi un programma Java che abbia un metodo che prenda due stringhe e
le compari lessico-graficamente. Il metodo dovrà restituire
"Le due stringhe sono uguali" o "Le due stringhe sono differenti"
basandosi sul risultato del confronto. Per la creazione della stringa
di risultato dovrebbe essere utilizzato StringBuilder.*/
public class String_builder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String saluto = scanner.nextLine();
        String saluto2 = scanner.nextLine();
        StringBuilder result = new StringBuilder("Le due stringhe sono ");
        if (saluto.equals(saluto2)) {
            result.append("uguali");
            System.out.println(result);

        } else {
            result.append("differenti");
            System.out.println(result);
        }
    }
}

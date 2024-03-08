package basi_di_java;


import static jdk.internal.icu.text.UTF16.charAt;
/*Scrivi un programma Java che abbia un metodo che prenda il carattere in Unicode in un indice
specifico all'interno di una stringa e lo stampi.
Il metodo dovrà avere nel costruttore una stringa ed una posizione e dovrà resituire il carattere in
unicode o una stringa di errore.
Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.
*/
public class String_builder_2 {
    public static void main(String[] args) {


        String stringa = "stringa";
        int posizione = 10;
        printUnicode(stringa, posizione);

    }

    public static void printUnicode(String stringa, int posizione) {
        StringBuilder result = new StringBuilder("La posizione è ");
        if(posizione > stringa.length()){
            result.append("non valida");
        }else {
            result.append(stringa.charAt(posizione));
        }
        System.out.println(result);
    }

}
/*Scrivi un programma che contiene un metodo che prenda un numero in ingresso e
capisca se un numero è pari o dispari utilizzando solo gli operatori logici.*/
public class es_6 {
    public static void main(String[] args) {
        int eveNumb=6;
        System.out.println("se il risultato è 1 il numero è dispari, se 0 è pari");
        System.out.println(even(eveNumb));

    }
    static int even(int a){
    /* l'operatore & confronta le cifre dei numeri decimali convertiti in binari e siccome in questo caso "a" è uguale
   al numero pari 6, in binario  l'ultima cifra binaria sarà sempre 0, mentre 1 in binario è 1 ed il risultato sarà
   sempre 0 (false) mentre se fosse stato un numero dispari il risultato sarebbe stato 1 */
        return (a&1);


    }
}

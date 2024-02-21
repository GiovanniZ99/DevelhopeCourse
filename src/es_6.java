/*Scrivi un programma che contiene un metodo che prenda un numero in ingresso e
capisca se un numero è pari o dispari utilizzando solo gli operatori logici.*/
public class es_6 {
    public static void main(String[] args) {
        int eveNumb=6;
        System.out.println(even(eveNumb));

    }
    static boolean even(int a){
        return a%2==0;
    }
}

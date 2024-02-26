
/*Scrivi un programma che contiene un metodo che dati 2 interi in ingresso ed un valore
di confronto verifichi se il numero di confronto è compreso tra due valori specifici e stampi
il risultato dell'operazione comprensivo dei due limiti (inferiore e superiore)*/
public class LogicOperatorFac {
    public static void main(String[] args) {
    int x=2;
    int y=7;
    int z=5;
        System.out.println(x);
        System.out.println(y);
        System.out.println(middleNumb(x,y,z));

    }
    static boolean middleNumb(int x, int y, int z){
        return (z>=x) && (z<=y);
    }
}

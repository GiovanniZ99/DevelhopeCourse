package basi_di_java;

/*Scrivi un programma che contenga un metodo che prende in ingresso un numero e
il massimo numero di risultati che vuoi avere e stampi tutti i numeri naturali in ordine
inverso (quindi se passo il punto di partenza a 6 e gli dico di restituirmi
3 risultati mi aspetto in uscita [6 5 4] stampati).*/
public class forfac2 {
    public static void main(String[] args) {
        int a=7;
        int b=2;
        maxInt(a, b);

    }
    public static void maxInt(int x, int maxResult){

       for(int i=0;i<maxResult;i++){
           System.out.println(x);
           x--;

       }

    }
}

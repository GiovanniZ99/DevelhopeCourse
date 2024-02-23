/*Scrivi un programma che contenga un metodo che prende in ingresso un numero e
il massimo numero di risultati che vuoi avere e stampi tutti i numeri naturali in ordine
inverso (quindi se passo il punto di partenza a 6 e gli dico di restituirmi
3 risultati mi aspetto in uscita [6 5 4] stampati).*/
public class forFac2 {
    public static void main(String[] args) {
        int a=3;
        maxInt(a);

    }
    public static void maxInt(int x){
        for(int i=x;i>x-3;i--){
            int result=i;
            System.out.println(result);
        }

    }
}

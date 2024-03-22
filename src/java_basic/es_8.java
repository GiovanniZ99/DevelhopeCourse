package java_basic;

/* Scrivi un programma che contenga un metodo che prende in ingresso un carattere
e ne identifica il tipo per un operazione di algebra (+ addizione - sottrazione
* moltiplicazione / divisione). Nel caso non riesca ad identificare il tipo
di operazione dovrà restituire una stringa di errore. */
public class es_8 {
    public static void main(String[] args) {
        char a='+';
        System.out.println(operation(a));
    }

    public static String operation(char a) {
        String result = "";
        switch (a) {
            case '+':
                result = "Addiziome";
                break;
            case '-':
                result = "Sottrazione";
                break;
            case '*':
                result = "Moltiplicazione";
                break;
            case '/':
                result = "Divisione";
                break;
            default:
                result = "Operatore errato";


        }
        return result;
    }

}

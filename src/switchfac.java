
/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e
restituisca il nome del giorno della settimana come stringa o una stringa di errore
 nel caso di valore maggiore di 7 o minore di 1.*/
public class switchfac {
    public static void main(String[] args) {




            }
    public static String week(int x){
        String result = "";
        switch (x) {
            case 1:
                result = "Lunedì";
                break;
            case 2:
                result = "Martedì";
                break;
            case 3:
                result ="Mercoledì";
                break;
            case 4:
                result="Giovedì";
                break;
            case 5:
                result="Venerdì";
                break;
            case 6:
                result="Sabato";
                break;
            case 7:
                result="Domenica";
                break;
            default:
                result="numero non valido";

        }
        return result;
    }
}

package basi_di_java;

/*Scrivi un programma che calcoli la lunghezza di una stringa, sulla base di questa
 lunghezza stampi "Lunghezza maggiore di 10", "Lunghezza minore di 10" o "Lunghezza pari a 10".*/
public class es_7 {
    public static void main(String[] args) {
        String stringa="Stringa";
        if(stringa.length()>10){
            maggioreDi10(stringa);
        }
        else if(stringa.length()==10){
            ugualeA10(stringa);
        }
        else{
            minoreDi10(stringa);
        }
    }

    static void maggioreDi10(String a){
        System.out.println("Lunghezza maggiore di 10");
    }
    static void ugualeA10(String a){
        System.out.println("Lunghezza pari a 10");
    }
    static void minoreDi10(String a){
        System.out.println("Lunghezza minore di 10");
    }
}
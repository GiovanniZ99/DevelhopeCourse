package basi_di_java;

/*Scrivere un programma che contenga un metodo che sfrutti il while loop e prenda in
ingresso 1 valore intero come limite superiore e calcoli la somma di tutti i valori prima
del limite e la stampi a video.
(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)*/
public class whilefac {
    public static void main(String[] args) {

        int x=5;
        System.out.println(sum(x));
    }
    public static int sum(int x){
        int i=0;
        int result=0;
        while(i<x){
            result+=i;
            i++;
        }
        return result;
    }
}

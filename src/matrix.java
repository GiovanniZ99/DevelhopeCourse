/*Scrivere un programma che contenga un metodo che permette di inizializzare
una matrice riempita con dei valori a vostro piacimento e
restituisca la somma degli elementi sulla prima riga*/
public class matrix {
    public static void main(String[] args) {
        int[][] biMatrix = {{1, 2, 3},
                     {4, 5, 6}
                     };
        System.out.println(sumMatrix(biMatrix));;
    }

    public static int sumMatrix(int[][] x) {
        int sum=0;
        for (int i=0;i<x[0].length;i++){

            sum+=x[0][i];
        }
    return sum;
    }
}

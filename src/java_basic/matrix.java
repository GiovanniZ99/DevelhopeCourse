package java_basic;

/*Scrivere un programma che contenga un metodo che permette di inizializzare
una matrice riempita con dei valori a vostro piacimento e
restituisca la somma degli elementi sulla prima riga*/
public class matrix {
    public static void main(String[] args) {
        int[][] newMatrix = new int[3][3];

        fillMatrix(newMatrix);
        System.out.println(sumMatrix(newMatrix));
    }


    public static void fillMatrix(int[][] matrix) {

        int valueMatrix = 2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += valueMatrix;
                valueMatrix++;
                System.out.print(matrix[i][j]+ " ");

            }
            System.out.println();

        }



    }
    public static int sumMatrix(int [][] matrixA) {
        int sum=0;

            for(int j=0;j<matrixA[0].length;j++){
               sum+=matrixA[0][j];
            }


        return sum;
    }


}
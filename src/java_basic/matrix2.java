package java_basic;/*Scrivere un programma che contenga un metodo che permette di inizializzare
una matrice e di scambiare le sue righe e le sue colonne stampandola a video.
Matrice di partenza
1 2 3
4 5 6
Matrice risultato
 1 4
 2 5
 3 6 */

public class matrix2 {
    public static void main(String[] args) {

        fillChangeMatrix();

    }


    public static void fillChangeMatrix() {
        int refillValue = 0;
        int[][] randomMatrix = new int[2][3];
        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix[i].length; j++) {
                randomMatrix[i][j] += refillValue;
                refillValue++;
                System.out.print(randomMatrix[i][j] + " ");
            }
            System.out.println();
        }
        int[][] changedMatrix = new int[3][2];
        for (int i = 0; i < changedMatrix.length; i++) {
            for (int j = 0; j < changedMatrix[i].length; j++) {
            changedMatrix[i][j]=randomMatrix[j][i];
                System.out.print(changedMatrix[i][j] + " ");
            }
            System.out.println();

        }
    }


}



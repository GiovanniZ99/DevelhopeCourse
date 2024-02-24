/*Scrivere un programma che contenga un metodo che permetta di sostituire
gli elementi duplicati in un array di interi con il valore -1.
L'array ottenuto dovrà essere stampato a video.*/
public class arrayFac2 {
    public static void main(String[] args) {

        int[] array = {2, 5, 7, 2, 9, 5, 7, 3, 2};
    changeArray(array);
        for (int j=0; j<array.length;j++) {
            System.out.println(array[j]);
        }

    }

    public static void changeArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i] = -1;
                    array[j] = -1;
                }
            }
        }

    }
}

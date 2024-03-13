/*Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array
per 0 e gestisca sia l'eccezione della divisione che quella di indice non presente nell'array,
leggendone il messaggio.Eseguire sempre un blocco di codice scrivendo un messaggio in console.*/
package java_advanced;
import java.util.Random;
public class Exception_es4 {

    public static void main(String[] args) {
        Random random = new Random();
        int divNumb = random.nextInt(7);
        int i = random.nextInt(7);
        int[] array = {1, 2, 3, 4};
        divBy0(array, divNumb, i);
    }

    public static void divBy0(int[] inputArray, int numeroDivisore, int index){
       int result;
        try {
             result = inputArray[index]/numeroDivisore;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Non puoi dividere un int per 0");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("indice troppo grande");
        }
    }
}

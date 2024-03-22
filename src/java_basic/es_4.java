package java_basic;
/* Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore scelto
da te e le moltiplichi fra di loro. Il metodo dovrà restituire il risultato dell'operazione che dovrà
essere stampato a video. */
public class es_4 {
    public static void main(String[] args) {
        int number_1=5;
        int number_2=7;
        System.out.println(numbers(number_1, number_2));
    }
    static int numbers(int x, int y) {
        x += 1;
        y += 1;
        return x*y;
    }
}

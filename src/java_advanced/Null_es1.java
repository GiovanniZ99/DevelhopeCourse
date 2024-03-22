package java_advanced;
/*Scrivere una funzione che accetti in input un numeratore e un denominatore
Controlli che il numeratore e il denominatore non siano null
Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.*/
public class Null_es1 {
    public static void main(String[] args) {
        Double num = null;
        Double den = null;
        numDen(num, den);
        Double num2 = null;
        Double den2 = 3.49594;
        numDen(num2, den2);
    }
    public static void numDen (Double numeratore, Double denominatore) {

        try{
            if (numeratore == null && denominatore == null) {
              throw new IllegalArgumentException("Numeratore e denominatore non possono essere null");

            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

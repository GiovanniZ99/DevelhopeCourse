package java_advanced;

/*Scrivere una funzione che accetti in input un numeratore e un denominatore
Controlli che il numeratore e il denominatore non siano null
Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.*/
public class Null_es1 {
    public static void main(String[] args) {
        Double num = null;
        Double den = null;
        try{
            System.out.println(div(num, den));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        /* I wrapper dei tipi primitivi non hanno eccezioni aritmetiche mentre ai tipi primitivi
        non posso assegnargli il valore null, quindi ho deciso di non includere l'eccezione aritmetica */
    }
    public static Double div (Double numeratore, Double denominatore) {
            if (numeratore == null || denominatore == null) {
              throw new IllegalArgumentException("Numeratore e denominatore non possono essere null");
            }else{
                return numeratore/denominatore;
            }
    }
}

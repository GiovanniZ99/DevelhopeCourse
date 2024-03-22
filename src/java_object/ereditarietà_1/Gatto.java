package java_object.ereditarietà_1;

public class Gatto extends Animale {
    protected Gatto(String verso){

        super(verso);
    }
    @Override
    protected void faiIlVerso() {
        System.out.println( "il gatto fa " + verso);
    }


    // Soluzione precedente
   /* @Override
    public void faiIlVerso() {
        System.out.println("miao");
    } */
}

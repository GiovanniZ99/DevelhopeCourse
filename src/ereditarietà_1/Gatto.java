package Ereditarietà_1;

public class Gatto extends Animale {
    public Gatto(String verso){

        super(verso);
    }
    @Override
    public void faiIlVerso() {
        System.out.println( "il gatto fa " + verso);
    }


    // Soluzione precedente
   /* @Override
    public void faiIlVerso() {
        System.out.println("miao");
    } */
}

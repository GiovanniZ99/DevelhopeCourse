/*nella classe Animale stai dichiarando un attributo che usi ma non hai modo di valorizzare
 (nè da costruttore nè da setter)
la classe Gatto è vuota
*/

package ereditarietà_1;

public class Animale {
    protected String verso;

    protected Animale(String verso){
        this.verso=verso;
    }

    protected void faiIlVerso(){
        System.out.println(verso);
    }

    // Soluzione precedente
    /*public void faiIlVerso(){
        System.out.println("Verso generico");
    }*/
}

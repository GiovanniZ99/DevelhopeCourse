/*Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato
calcolaArea() che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea()
per calcolare l'area del rettangolo. Crea un enum che dica di che tipo è la forma.
*/

package ereditarietà_2;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo= new Rettangolo(2,5);
        System.out.println(rettangolo.calcolaArea());
        Triangolo triangolo = new Triangolo(3, 6);
        System.out.println(triangolo.calcolaArea());
        System.out.println(triangolo.getTipo());
        System.out.println(rettangolo.getTipo());
    }
}

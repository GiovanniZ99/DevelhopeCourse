/*Scrivere un programma che contenga una classe chiamata Animale ed un metodo
chiamato faiIlVerso() che stampi il verso dell'animale.
Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso() per miagolare.
Prova quindi a far stampare il verso di Animale e di Gatto.*/

package java_object.ereditarietà_1;
public class Main {
    public static void main(String[] args) {
    Animale animale1=new Animale("verso generico");
    Gatto figaro=new Gatto("miao");
    animale1.faiIlVerso();
    figaro.faiIlVerso();
    }
}

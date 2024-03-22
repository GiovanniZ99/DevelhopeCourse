/*A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area,
aggiungere una ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima
figura
*/

package java_object.ereditarietà_2;

public class Triangolo extends Forma {
    float base;
    float height;

    public Triangolo(float base, float height) {
        this.base = base;
        this.height = height;
        super.setTipo(tipoForma.TRIANGOLO);


    }

    @Override
    public float calcolaArea() {
        return base * height / 2;
    }
}

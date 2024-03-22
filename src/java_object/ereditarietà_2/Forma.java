package java_object.ereditarietà_2;

enum tipoForma{
    TRIANGOLO,
    RETTANGOLO
}
public class Forma {

    /*protected float area;
    public float calcolaArea(){
        return area;*/
    protected int nLati;
    protected float lLati;

    protected float altezza;

    private tipoForma tipo;


    public tipoForma getTipo() {
        return tipo;
    }

    public void setTipo(tipoForma tipo) {
        this.tipo = tipo;
    }

    public float calcolaArea() {
        return (nLati * lLati * altezza) / 2;

    }

    }


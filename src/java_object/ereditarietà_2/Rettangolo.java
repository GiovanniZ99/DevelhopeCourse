package java_object.ereditarietà_2;

public class Rettangolo extends Forma {
   public float base;
   public float height;
   public Rettangolo (float base, float height){
       this.base = base;
       this.height = height;
       super.setTipo(tipoForma.RETTANGOLO);

   }


    @Override
    public float calcolaArea() {
        return base * height;
    }
}

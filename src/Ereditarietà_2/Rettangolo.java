package Ereditarietà_2;

public class Rettangolo extends Forma {
   float base;
   float height;
   public Rettangolo (float base, float height){
       this.base = base;
       this.height = height;
   }

    @Override
    public float calcolaArea() {
        return base * height;
    }
}

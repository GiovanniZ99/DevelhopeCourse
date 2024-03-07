package Abstract_es;

public class Triangolo extends Forma {
   private float base;
   private float height;

    public Triangolo(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float calculateArea(){
        return (base * height)/2;
    }

}

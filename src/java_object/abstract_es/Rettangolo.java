package java_object.abstract_es;

public class Rettangolo extends Forma {
    private float base;

   private float height;

    public Rettangolo(float base, float height) {
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
    public float calculateArea() {
        return base * height;
    }
}

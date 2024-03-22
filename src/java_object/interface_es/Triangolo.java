package java_advanced.interface_es;

public class Triangolo implements Forma {
    private float base;

   private float height;

    public Triangolo(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calcolaArea() {
        return (base * height)/2;
    }
}

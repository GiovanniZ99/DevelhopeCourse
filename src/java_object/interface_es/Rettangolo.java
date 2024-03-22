package java_advanced.interface_es;

public class Rettangolo implements Forma{
    private float base;

  private float height;

    public Rettangolo(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calcolaArea() {
        return base * height;
    }
}

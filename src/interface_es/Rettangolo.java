package interface_es;

public class Rettangolo implements Forma{
    private float base;

  private float height;

    @Override
    public float calcolaArea() {
        return base * height;
    }
}

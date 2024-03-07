package interface_es;

public class Rettangolo implements Forma{
    float base;

    float height;

    @Override
    public float calcolaArea() {
        return base * height;
    }
}

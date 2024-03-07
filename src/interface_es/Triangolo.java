package interface_es;

public class Triangolo implements Forma {
    float base;

    float height;

    @Override
    public float calcolaArea() {
        return (base * height)/2;
    }
}

package Abstract_es;

public class Rettangolo extends Forma {
    float base;

    float height;

    @Override
    public float area() {
        return base * height;
    }
}

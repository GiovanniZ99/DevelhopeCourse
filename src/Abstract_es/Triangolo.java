package Abstract_es;

public class Triangolo extends Forma {
    float base;
    float height;

    @Override
    public float area(){
        return (base * height)/2;
    }

}

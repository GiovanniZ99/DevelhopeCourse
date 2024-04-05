package java_advanced.factory_method;

public class ShapeFactory {
    public static Shape getForma(ShapeTypes shape) {
     Shape newShape = switch (shape) {
         case CERCHIO -> new Cerchio();
         case RETTANGOLO -> new Rettangolo();
        };
        return newShape;
    }
}

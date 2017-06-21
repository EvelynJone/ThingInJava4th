package polymorphism.shape;

/**
 * @author zhaoxl
 * @date 2017/6/20
 */
public class Shapes {
    private static RandomShapeGenerator generator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[20];
        for (int i = 0; i < 20; i++) {
            shapes[i] = generator.next();
        }
        for (Shape shape : shapes) {
            shape.printShape();
        }
    }
}

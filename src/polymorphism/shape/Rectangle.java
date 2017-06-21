package polymorphism.shape;

/**
 * @author zhaoxl
 * @date 2017/6/20
 */
public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle.erase()");
    }

    @Override
    public void printShape() {
        System.out.println("Rectangle print");
    }
}

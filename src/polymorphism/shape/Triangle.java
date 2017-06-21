package polymorphism.shape;

/**
 * 三角形
 * @author zhaoxl
 * @date 2017/6/20
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}

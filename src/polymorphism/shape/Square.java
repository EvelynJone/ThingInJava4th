package polymorphism.shape;

/**
 * 正方形
 * @author zhaoxl
 * @date 2017/6/20
 */
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}

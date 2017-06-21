package polymorphism.shape;

import java.util.Random;

/**
 * 工厂
 * @author zhaoxl
 * @date 2017/6/20
 */
public class RandomShapeGenerator {
    private Random random = new Random(47);

    public Shape next() {
        switch (random.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();    // 此时进行了向上转型
            case 2: return new Triangle();
            case 3: return new Rectangle();
        }
    }
}

package polymorphism;

/**
 * 构造器内部的多态行为
 * @author zhaoxl
 * @date 2017/7/31
 */
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}

//雕文
class Glyph {

    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

//圆雕
class RoundGlyph extends Glyph{
    private int radius = 1;
    void draw() {
        System.out.println("RoundGlyph.draw(),radius= "+radius);
    }
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(),radius= "+radius);

    }
}
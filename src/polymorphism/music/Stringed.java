package polymorphism.music;

/**
 * @author zhaoxl
 * @date 2017/6/19
 */
public class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play()" + n);
    }
}

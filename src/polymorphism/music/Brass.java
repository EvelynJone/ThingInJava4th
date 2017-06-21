package polymorphism.music;

/**
 * @author zhaoxl
 * @date 2017/6/19
 */
public class Brass extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Brass.play()" + n);
    }
}

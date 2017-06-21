package polymorphism.music;

/**
 * 风琴
 * @author zhaoxl
 * @date 2017/6/19
 */
public class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }
}

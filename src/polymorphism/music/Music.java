package polymorphism.music;

/**
 * @author zhaoxl
 * @date 2017/6/19
 */
public class Music {
    /**
     * 接收任何导出自Instrument的类
     * 向上转型
     * @param instrument
     */
    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}

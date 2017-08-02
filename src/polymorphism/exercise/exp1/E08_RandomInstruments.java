package polymorphism.exercise.exp1;

/**
 * @author zhaoxl
 * @date 2017/7/1
 */
public class E08_RandomInstruments {
    public static void main(String[] args) {
        InstrumentGenerator gen = new InstrumentGenerator();
        for (int i = 0; i < 20; i++) {
            System.out.println(gen.next());
        }
    }
}

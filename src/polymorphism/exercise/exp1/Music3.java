package polymorphism.exercise.exp1;

import polymorphism.music.Note;

import java.util.Random;

/**
 * @author zhaoxl
 * @date 2017/6/20
 */
public class Music3 {
    public static void tune(Instrument i) {
        System.out.println(i);
    }

    public static void tuneAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }
    public static void main(String[] args) {
        Instrument[] orchestra = {
               new Instrument(), new Circle()
        };
        tuneAll(orchestra);
    }
}

class InstrumentGenerator {
    Random random = new Random(47);
    Class<?> instruments[] = {Cycle.class,Electronic.class};
    public Instrument next() {
        try {
            int idx = Math.abs(random.nextInt(instruments.length));
            return (Instrument) instruments[idx].newInstance();
        } catch (Exception e) {
             throw new RuntimeException("Cannot Create",e);
        }
    }
}

class Electronic extends Instrument {
    @Override
    void play(Note note) {
        System.out.println("Electronic.play() " + note);
    }

    @Override
    String what() {
        return "Electronic";
    }
}
class Instrument {
    void play(Note note){
        System.out.println("Instrument.play() " + note);
    }

    String what() {
        return "Instrument";
    }
    @Override
    public String toString() {
        return what();
    }
}

class Circle extends Instrument {
    @Override
    void play(Note note) {
        System.out.println("Circle.play() " + note);
    }

    @Override
    String what() {
        return "Circle";
    }
}

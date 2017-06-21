package polymorphism.exercise.exp1;

import polymorphism.music.Note;

/**
 * @author zhaoxl
 * @date 2017/6/20
 */
public class Music3 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }
    public static void main(String[] args) {
        Instrument[] orchestra = {
               new Instrument(),
        };
        tuneAll(orchestra);
    }
}

class Instrument {
    void play(Note note){
        System.out.println("Instrument.play() " + note);
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
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
    void adjust() {
        System.out.println("Circle adjust");
    }

    @Override
    String what() {
        return "Circle";
    }
}

package polymorphism.music3;

import javafx.util.converter.PercentageStringConverter;
import org.omg.CORBA.PUBLIC_MEMBER;
import polymorphism.music.Note;
import sun.awt.windows.WingDings;

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
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    /**
     * 乐器描述
     * @return
     */
    String what() {
        return "Instrument";
    }

    /**
     * 调音方法
     */
    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Wind play() " + n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    private String name = "Percussion";

    @Override
    void play(Note n) {
        System.out.println(name + ".play() " + n);
    }

    @Override
    String what() {
        return name;
    }

    @Override
    void adjust() {
        System.out.println("Adjusting " + name);
    }
}

class Stringed extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Stringed play() " + n);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Brass play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Woodwind play() " + n);
    }

    @Override
    String what() {
        return "Woodwind";
    }
}


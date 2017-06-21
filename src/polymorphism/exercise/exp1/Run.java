package polymorphism.exercise.exp1;

import com.sun.org.apache.xml.internal.security.keys.content.SPKIData;

/**
 * @author zhaoxl
 * @date 2017/6/19
 */
public class Run {
    public static void run(Cycle cycle) {
        cycle.run();
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle(Speed.SLOW);
        Bicycle bicycle = new Bicycle(Speed.MEDIUM);
        Tricycle tricycle = new Tricycle(Speed.FAST);
        run(unicycle);
        run(bicycle);
        run(tricycle);
    }
}

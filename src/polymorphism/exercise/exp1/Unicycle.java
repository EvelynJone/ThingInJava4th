package polymorphism.exercise.exp1;

/**
 * 独轮车
 * @author zhaoxl
 * @date 2017/6/19
 */
public class Unicycle extends Cycle {
    private Speed speed;

    @Override
    public void run() {
        System.out.println("Unicycle run(),the speed is " + speed);
    }

    public Unicycle(Speed speed) {
        this.speed = speed;
    }

    public Unicycle() {
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }
}

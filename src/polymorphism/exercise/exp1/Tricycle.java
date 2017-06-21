package polymorphism.exercise.exp1;

/**
 * 三轮车
 * @author zhaoxl
 * @date 2017/6/19
 */
public class Tricycle extends Cycle {
    private Speed speed;

    @Override
    public void run() {
        System.out.println("Tricycle run(),the speed is " + speed);
    }

    public Tricycle() {
    }

    public Tricycle(Speed speed) {
        this.speed = speed;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }
}

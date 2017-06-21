package polymorphism.exercise.exp1;

/**
 * 自行车
 * @author zhaoxl
 * @date 2017/6/19
 */
public class Bicycle extends Cycle {
    private Speed speed;

    @Override
    public void run() {
        System.out.println("Bycycle run()  ,the speed is " + speed);
    }

    public Bicycle(Speed speed) {
        this.speed = speed;
    }

    public Bicycle() {
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public static void main(String[] args) {

    }
}

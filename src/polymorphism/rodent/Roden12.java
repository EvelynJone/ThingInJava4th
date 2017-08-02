package polymorphism.rodent;

import java.util.Random;

/**
 * @author zhaoxl
 * @date 2017/7/31
 */
public class Roden12 {
    private static RandomRodentGenerator generator = new RandomRodentGenerator();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[10];
        for (Rodent rodent : rodents) {
            rodent = generator.next();
            System.out.println(rodent);
        }
    }
}

class Characteristic{
    private String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
}

class Description{
    private String s;
    Description(String s){
        this.s = s;
        System.out.println("Creating Description " + s);
    }
}

class Rodent {
    private String name = "Rodent";
    private Characteristic c = new Characteristic("has tail"); // tail:尾巴
    private Description d = new Description("small mammal"); // mammal : 哺乳动物
    Rodent(){
        System.out.println("Rodent()");
    }

    protected void eat() {
        System.out.println("Rodent.eat()");
    }

    protected void run() {
        System.out.println("Rodent.run()");
    }

    protected void sleep() {
        System.out.println("Rodent.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Mouse extends Rodent {
    private String name = "Mouse";
    private Characteristic c = new Characteristic("likes cheese");
    private Description d = new Description("nocturnal"); // nocturnal : 夜间动物
    Mouse(){
        System.out.println("Mouse()");
    }

    protected void eat() {
        System.out.println("Mouse.eat()");
    }

    protected void run() {
        System.out.println("Mouse.run()");
    }

    protected void sleep() {
        System.out.println("Mouse.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

//大家鼠
class Rat extends Rodent{
    private String name = "Rat";
    private Characteristic c = new Characteristic("larger");
    private Description d = new Description("black");
    Rat(){
        System.out.println("Rat()");
    }

    protected void eat() {
        System.out.println("Rat.eat()");
    }

    protected void run() {
        System.out.println("Rat.run()");
    }

    protected void sleep() {
        System.out.println("Rat.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

//松鼠
class Squirrel extends Rodent{
    private String name = "Squirrel";
    private Characteristic c = new Characteristic("climbs trees");
    private Description d = new Description("likes nuts");
    Squirrel(){
        System.out.println("Squirrel()");
    }

    protected void eat() {
        System.out.println("Squirrel.eat()");
    }

    protected void run() {
        System.out.println("Squirrel.run()");
    }

    protected void sleep() {
        System.out.println("Squirrel.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

 class RandomRodentGenerator {
    private Random random = new Random();

    public Rodent next (){
        switch (random.nextInt(3)) {
            default:
            case 0: return new Mouse();
            case 1: return new Rat();
            case 2: return new Squirrel();
        }
    }
}
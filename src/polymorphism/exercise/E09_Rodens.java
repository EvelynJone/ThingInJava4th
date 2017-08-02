package polymorphism.exercise;

/**
 * @author zhaoxl
 * @date 2017/7/1
 */
public class E09_Rodens {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for (Rodent rodent : rodents) {
            rodent.hop();
            rodent.scurry();
            rodent.reproduce();
            System.out.println(rodent);
        }
    }
}
class Rodent {
    /**
     * 跳
     */
    public void hop() {
        System.out.println("Rodent hopping");
    }

    /**
     * 疾走
     */
    public void scurry() {
        System.out.println("Rodent scurrying");
    }

    /**
     * 复制
     */
    public void reproduce() {
        System.out.println("Making more Rodents");
    }

    @Override
    public String toString() {
        return "Rodent";
    }
}

class Mouse extends Rodent {
    @Override
    public void hop() {
        System.out.println("Mouse hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Mouse scurrying");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more mouses");
    }

    @Override
    public String toString() {
        return "Mouse";
    }
}

class Gerbil extends Rodent {
    @Override
    public void hop() {
        System.out.println("Gerbil hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Gerbil scurrying");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more gerbils");
    }

    @Override
    public String toString() {
        return "Gerbil";
    }
}

class Hamster extends Rodent {
    @Override
    public void hop() {
        System.out.println("Hamster hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Hamster scurrying");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more hamsters");
    }

    @Override
    public String toString() {
        return "Hamster";
    }
}
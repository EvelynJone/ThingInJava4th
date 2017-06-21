package polymorphism.exercise.exp1;

/**
 * 官方提供正确答案
 * @author zhaoxl
 * @date 2017/6/19
 */
 public  class Biking {
    public static void ride(Cycle2 cycle) {
        cycle.travel(cycle);
    }

    public static void main(String[] args) {
        Unicycle2 u = new Unicycle2();
        Bicycle2 bicycle = new Bicycle2();
        ride(u);
        ride(bicycle);
    }
}

 class Cycle2{
     private String cycleName;
     public void travel(Cycle2 cycle) {
         System.out.println("Cycle ride() "+cycle);
     }

     @Override
     public String toString() {
         return this.cycleName;
     }
 }
class Unicycle2 extends Cycle2 {
    private String cycleName = "Unicycle";

    @Override
    public String toString() {
        return this.cycleName;
    }
}

class Bicycle2 extends Cycle2 {
    private String cycleName = "Bicycle";

    @Override
    public String toString() {
        return this.cycleName;
    }
}



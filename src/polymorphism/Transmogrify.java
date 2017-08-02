package polymorphism;

/**
 * @author zhaoxl
 * @date 2017/8/2
 */
public class Transmogrify {
    public static void main(String[] args) {
        State state = new State();
        state.performPlay();
        state.change();
        state.performPlay();
    }
}

class Actor {
    public void act(){}
}

class HappyActor extends Actor {
    @Override
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        System.out.println("SadActor");
    }
}

class State{
    private Actor actor = new HappyActor();
    public void change() {
        actor = new SadActor();
    }
    public void performPlay(){
        actor.act();
    }
}
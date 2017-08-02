package polymorphism;

/**
 * @author zhaoxl
 * @date 2017/7/31
 */
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
                new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared)
        };
        for (Composing composing : composings) {
            composing.dispose();
        }
    }
}

// 成员对象中存在于其他一个或多个对象共享的情况下
class Shared {
    private int refCount = 0;
    private static long counter = 0; // 跟踪所创建的Shared的实例的数量，类型设置为long，防止溢出
    private final long id = counter ++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refCount ++;
    }
    protected void dispose() {
        if (--refCount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared{" +
                "id=" + id +
                '}';
    }
}

class Composing  {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter ++;

    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing{" +
                "id=" + id +
                '}';
    }
}
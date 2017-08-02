package polymorphism.exercise;

/**
 * @author zhaoxl
 * @date 2017/7/31
 */
public class ReferenceCounting13 {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = { new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)
        };
        for(Composing c : composing)
            c.dispose();
        Composing compTest = new Composing(shared);
        Composing compTest2 = new Composing(shared);
        // Test finalize():
        shared.finalize();
        Shared sharedTest = new Shared();
        Composing compTest3 = new Composing(sharedTest);
        // Test sharedTest finalize():
        sharedTest.finalize();
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

    protected void finalize() {
        if (refCount > 0) {
            System.out.println("Error: " + refCount + " Shared " + id + " objects in use");
        }
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
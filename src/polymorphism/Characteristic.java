package polymorphism;

/**
 * @author zhaoxl
 * @date 2017/7/31
 */
class Characteristic {
    private String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }

    protected void dispose() {
        System.out.println("disposing Characteristic " + s);
    }
}

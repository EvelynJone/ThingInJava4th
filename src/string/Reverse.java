package string;

/**
 * @author zhaoxl
 * @date 2017/8/8
 */
public class Reverse {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("os\\ud801china");
        sb.reverse();
        System.out.println(sb.toString());
    }
}

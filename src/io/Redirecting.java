package io;

import java.io.*;

/**
 * @author zhaoxl
 * @date 2017/8/8
 */
public class Redirecting {
    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("src\\io\\Redirecting.java"));
        PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
        System.setIn(in);
        System.setOut(out); // IO重定向操纵的是字节流，不是字符流，因此使用的是InputStream而不是Reader
        System.setErr(out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null)
            System.out.println(s);
        out.close();
        System.setOut(console);

    }
}

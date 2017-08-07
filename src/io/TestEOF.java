package io;

import java.io.*;

/**
 * 使用avaliable查询还有多少可供存取的字符
 * @author zhaoxl
 * @date 2017/8/4
 */
public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(new FileInputStream("G:\\mine projects\\ThinkInJava4th\\src\\io\\TestEOF.java"))
        );
        while (in.available() != 0)
            System.out.print((char) in.readByte());
    }
}

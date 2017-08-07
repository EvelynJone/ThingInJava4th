package io;

import java.io.IOException;
import java.io.StringReader;

/**
 * @author zhaoxl
 * @date 2017/8/3
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("G:\\mine projects\\ThinkInJava4th\\src\\io\\MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1)
            System.out.print((char) c);
    }
}

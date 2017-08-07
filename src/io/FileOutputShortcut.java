package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * PrintWriter中添加了一个辅助器，直接使用fileName进行创建，仍旧是在进行缓存，只是不必自己去实现
 * @author zhaoxl
 * @date 2017/8/5
 */
public class FileOutputShortcut {
    static String filename = "FileOutputShortcut.out";
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(
                BufferedInputFile.read("G:\\mine projects\\ThinkInJava4th\\src\\io\\FileOutputShortcut.java")));
        PrintWriter out = new PrintWriter(filename);
        int lineCount = 1;
        String s ;
        while ((s = in.readLine()) != null) {
            out.println(lineCount ++ + ": " + s);
        }

        out.close();
        System.out.println(BufferedInputFile.read(filename));

    }
}

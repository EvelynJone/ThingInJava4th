package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 缓冲，读取文件
 * @author zhaoxl
 * @date 2017/8/3
 */
public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null)
            sb.append(s).append("\n"); // 换行符要记得加，因为readLine会把换行符删掉
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(Class.class.getClass().getResource("/").getPath());
        //System.out.println(read("G:\\mine projects\\ThinkInJava4th\\src\\io\\BufferedInputFile.java"));
    }
}

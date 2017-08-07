package io;

import java.io.*;

/**
 * 记录文件的行号
 * @author zhaoxl
 * @date 2017/8/4
 */
public class BasicFileOutput {
    static String fileName = "BasicFileOutput.out";
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(
                BufferedInputFile.read("G:\\mine projects\\ThinkInJava4th\\src\\io\\BasicFileOutput.java")
        ));
        PrintWriter out = new PrintWriter(new BufferedWriter(
                new FileWriter(fileName)
        ));
        int lineCount = 1;
        String s ;
        while ((s = in.readLine()) != null){
            out.println(lineCount++ + ": " + s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(fileName));
    }
}

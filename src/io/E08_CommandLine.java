package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author zhaoxl
 * @date 2017/8/3
 */
public class E08_CommandLine {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java E08_CommandLine file");
            return;
        }
        LinkedList<String> result = E07_FileIntoList.fileIntoList("G:\\mine projects\\ThinkInJava4th\\src\\io\\" + args[0]);
        for(ListIterator<String> it = result.listIterator(result.size());it.hasPrevious();)
            System.out.println(it.previous());
            //System.out.println(it.previous().toUpperCase()); 所有的字符变大写
    }
}

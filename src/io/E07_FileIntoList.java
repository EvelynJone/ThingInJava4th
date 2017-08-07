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
public class E07_FileIntoList {
    public static void main(String[] args) throws IOException {
        LinkedList<String> result = fileIntoList("G:\\mine projects\\ThinkInJava4th\\src\\io\\E07_FileIntoList.java");
        for(ListIterator<String> it = result.listIterator(result.size());it.hasPrevious();)
            System.out.println(it.previous());
    }

    public static LinkedList<String> fileIntoList(String filename) throws IOException {
        LinkedList<String> result = new LinkedList<>();
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        while ((s = in.readLine()) != null){
            result.add(s);
        }
        in.close();
        return result;
    }
}

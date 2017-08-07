package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author zhaoxl
 * @date 2017/8/5
 */
public class E12_LineNumber {
    public static void main(String[] args) throws IOException {
        LinkedList test = fileToList("E12_LineNumber.java");
        for(ListIterator it = test.listIterator(test.size());it.hasPrevious();){
            System.out.println(it.previous());
        }
    }

    private static LinkedList fileToList(String file) throws IOException {
        LinkedList<String> result = new LinkedList<>();
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("G:\\mine projects\\ThinkInJava4th\\src\\io\\" + file )));
        int lineCount = 1;
        String s ;
        while ((s = in.readLine()) != null)
            result.add(lineCount ++ +": " + s);
        return result;
    }
}

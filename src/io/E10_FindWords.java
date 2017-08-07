package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

/**
 * @author zhaoxl
 * @date 2017/8/3
 */
public class E10_FindWords {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Usage: java E10_FindWords file");
            return;
        }
        Set<String> words = new HashSet<>();
        for (int i = 1; i < args.length; i++) {
            words.add(args[i]);
        }
        LinkedList<String> result = E07_FileIntoList.fileIntoList("G:\\mine projects\\ThinkInJava4th\\src\\io\\" + args[0]);
        for(ListIterator<String> it = result.listIterator(result.size());it.hasPrevious();){
            String candidate = it.previous();
            for (String word : words) {
                if (candidate.indexOf(word) != -1) {
                    System.out.println(candidate);
                    break;
                }
            }
        }

    }

}

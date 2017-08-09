package io;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * @author zhaoxl
 * @date 2017/8/8
 */
public class E17_CharactersInfo {
    public static void main(String[] args) {
        Map<Character,Integer> charsStat = new HashMap<>();
        for (String word : new TextFile("src\\io\\E17_CharactersInfo.java","\\W+")) {
            for (int i = 0; i < word.length(); i++) {
                Character ch = word.charAt(i);
                Integer freq = charsStat.get(ch);
                charsStat.put(ch,freq == null ? 1 : freq + 1);
            }
        }
        List<Character> keys = Arrays.asList(charsStat.keySet().toArray(new Character[0]));
        Collections.sort(keys);
        for (Character key : keys) {
            System.out.println(key + " => " + charsStat.get(key));
        }
    }
}

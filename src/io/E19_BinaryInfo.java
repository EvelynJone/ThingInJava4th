package io;

import net.mindview.util.BinaryFile;

import java.io.IOException;
import java.util.*;

/**
 * @author zhaoxl
 * @date 2017/8/8
 */
public class E19_BinaryInfo {
    public static void main(String[] args) throws IOException {
        byte[] data = BinaryFile.read("src\\io\\E19_BinaryInfo.java");
        Map<Byte,Integer> bytesStat = new HashMap<>();
        for (byte b : data) {
            Integer freq = bytesStat.get(b);
            bytesStat.put(b,freq == null ? 1 : freq + 1);
        }

        List<Byte> keys = Arrays.asList(bytesStat.keySet().toArray(new Byte[0]));
        List<Byte> k = new ArrayList<>(bytesStat.keySet());
        Collections.sort(keys);
        for (Byte key : keys) {
            System.out.println(key + " => " + bytesStat.get(key));
        }
    }
}

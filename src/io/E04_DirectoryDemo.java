package io;

import net.mindview.util.Directory;

import java.io.File;

/**
 * @author zhaoxl
 * @date 2017/8/3
 */
public class E04_DirectoryDemo {
    public static void main(String[] args) {
        long total = 0;
        for (File file : Directory.walk(".").files) {
            total += file.length();
        }
        System.out.println(total);
    }
}

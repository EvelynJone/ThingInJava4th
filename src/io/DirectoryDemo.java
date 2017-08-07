package io;

import net.mindview.util.Directory;
import net.mindview.util.PPrint;

import java.io.File;

/**
 * @author zhaoxl
 * @date 2017/8/3
 */
public class DirectoryDemo {
    public static void main(String[] args) {
        PPrint.pprint(Directory.walk(".").dirs);
        for (File file : Directory.local(".", "T.*")) {
            System.out.println(file);
        }
        for (File file : Directory.walk(".", "T.*\\.java").files) {
            System.out.println(file);
        }

        System.out.println("======================");
        for (File file : Directory.walk(".", "T.*\\.class").files) {
            System.out.println(file);
        }
    }
}

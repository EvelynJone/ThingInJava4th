package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author zhaoxl
 * @date 2017/8/7
 */
public class UsingRandomAccessFile {
    static String file = "rtest.dat";

    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file,"rw");
        for (int i = 0; i < 7; i++) {
            rf.writeDouble(i * 1.414);
        }
        rf.writeUTF("The end of the file");
        rf.close();
        display();
        rf = new RandomAccessFile(file,"rw");

        rf.seek(5*8);// 因为double占8个字节
        rf.writeDouble(47.0001);
        rf.close();
        display();
    }

    public static void display() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file,"r");
        for (int i = 0; i < 7; i++) {
            System.out.println("Value " + i + ": " + rf.readDouble());
        }
        System.out.println(rf.readUTF());
        rf.close();
    }
}

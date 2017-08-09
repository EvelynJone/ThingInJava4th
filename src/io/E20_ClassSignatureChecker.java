package io;

import net.mindview.util.BinaryFile;
import net.mindview.util.Directory;

import java.io.File;
import java.io.IOException;

/**
 * 检测目录树下的class文件是否以十六进制字符‘CA FE BA BE’开头
 * @author zhaoxl
 * @date 2017/8/8
 */
public class E20_ClassSignatureChecker {
    final static byte[] signature = {
            (byte) 202, (byte) 254, (byte) 186, (byte) 190
    };

    public static void main(String[] args) throws IOException {
        String dir = "G:\\mine projects\\ThinkInJava4th\\out";
        if (args.length == 1)
            dir = args[0];
        for (File file : Directory.walk(dir, "T.*\\.class").files) {
            byte[] bt = BinaryFile.read(file);
            for (int i = 0; i < signature.length; i++) {
                if (bt[i] != signature[i]) {
                    System.err.println(file + " is corrupt!");
                    break;
                }
            }
        }
    }
}

package net.mindview.util;

import java.io.*;

/**
 * 读取二进制文件
 * @author zhaoxl
 * @date 2017/8/8
 */
public class BinaryFile {

    public static byte[] read(File bFile) throws IOException {
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(bFile));
        try {
            byte[] data = new byte[in.available()]; // 用来产生恰当的数组尺寸
            in.read(data);
            return data;
        } finally {
            in.close();
        }
    }

    public static byte[] read(String bFile) throws IOException {
        return read(new File(bFile));
    }

}

package io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * 格式化数据
 * @author zhaoxl
 * @date 2017/8/4
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            // 必须为ByteArrayInputStream提供字节数组
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read("G:\\mine projects\\ThinkInJava4th\\src\\io\\FormattedMemoryInput.java").getBytes()));

            while (true)
                System.out.print((char) in.readByte());
        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
}

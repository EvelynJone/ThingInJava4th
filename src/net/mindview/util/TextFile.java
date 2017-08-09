package net.mindview.util;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author zhaoxl
 * @date 2017/8/8
 */
public class TextFile extends ArrayList<String> {

    /**
     * 读取文件内容，若出现异常则抛出RuntimeException
     * 将每行添加到StringBuilder，并且为每行加上换行符，因为在读的过程中换行符会被除去掉；
     * 之后返回一个包含整个文件的字符串
     * @param fileName
     * @return
     */
    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsoluteFile()));
            try {
                String s ;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    /**
     * 打开文件并将其写入文件
     * @param fileName
     * @param text
     */
    public static void write(String fileName,String text) {
        try {
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                //确保文件流被正常的关闭
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 构造方法：根据文件名称，以分隔符为splitter生成list
     * @param fileName
     * @param splitter
     */
    public TextFile(String fileName,String splitter) {
        super(Arrays.asList(read(fileName).split(splitter)));
        if (get(0).equals("")) remove(0);
    }

    /**
     * 构造方法：根据文件名称，以‘\n’为分隔符生成list
     * @param fileName
     */
    public TextFile(String fileName) {
        this(fileName,"\n");
    }

    public void write(String fileName) {
        try {
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            try {
                for (String item : this) {
                    out.println(item);
                }
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String file = read("src\\net\\mindview\\util\\TextFile.java");
        write("test.txt",file);

        TextFile text = new TextFile("test.txt");
        text.write("test2.txt");

        TreeSet<String> words = new TreeSet<>(new TextFile("src\\net\\mindview\\util\\TextFile.java","\\W+"));
        System.out.println(words.headSet("a"));
    }
}

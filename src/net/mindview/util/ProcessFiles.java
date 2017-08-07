package net.mindview.util;

import java.io.File;
import java.io.IOException;

/**
 * 在目录中穿行，并根据Strategy对象来处理这些目录中的文件
 * 查找具有特定扩展名（传递给构造器的ext参数）的文件所需的全部工作，并且当它找到匹配的文件时，将直接把文件传递给Strategy对象
 * @author zhaoxl
 * @date 2017/8/3
 */
public class ProcessFiles {

    public interface Strategy {
        void process(File file);
    }

    private Strategy strategy;
    private String ext;
    public ProcessFiles(Strategy strategy,String ext) {
        this.strategy = strategy;
        this.ext = ext;
    }

    public void start(String[] args) {
        try {
            if (args.length == 0)
                processDirectoryTree(new File("."));
            else
                for (String arg : args) {
                    File fileArg = new File(arg);
                    if (fileArg.isDirectory())
                        processDirectoryTree(fileArg);
                    else {
                        if (!arg.endsWith("." + ext))
                            arg += "." + ext;
                        strategy.process(new File(arg).getCanonicalFile());
                    }
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void processDirectoryTree(File root) throws IOException{
        for (File file : Directory.walk(root.getAbsolutePath(), ".*\\." + ext).files) {
            strategy.process(file.getCanonicalFile());
        }
    }

    public static void main(String[] args) {
        new ProcessFiles(new ProcessFiles.Strategy(){
            @Override
            public void process(File file) {
                System.out.println(file);
            }
        },"java").start(args);

    }
}

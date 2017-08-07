package io;

import net.mindview.util.Directory;
import net.mindview.util.ProcessFiles;

import java.io.File;
import java.io.IOError;
import java.io.IOException;

/**
 * @author zhaoxl
 * @date 2017/8/3
 */
public class E05_ProcessFile2 {
    private ProcessFiles.Strategy strategy;
    private String regex;

    public E05_ProcessFile2(ProcessFiles.Strategy strategy, String regex) {
        this.strategy = strategy;
        this.regex = regex;
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
                    else if (arg.matches(regex))
                        strategy.process(fileArg.getCanonicalFile());
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processDirectoryTree(File root) throws IOException{
        for (File file : Directory.walk(root.getAbsolutePath(), regex).files) {
            strategy.process(file.getCanonicalFile());
        }
    }

    public static void main(String[] args) {
        new E05_ProcessFile2(new ProcessFiles.Strategy() {
            @Override
            public void process(File file) {
                System.out.println(file);
            }
        },".*\\.class").start(args);
    }
}

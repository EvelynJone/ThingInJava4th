package io;

import net.mindview.util.ProcessFiles;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * 查找某个特定目录子树下的所有在某个特定日期之后进行过修改的Java源文件
 * @author zhaoxl
 * @date 2017/8/3
 */
public class E06_ProcessFile3 {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance(
                DateFormat.SHORT, Locale.CHINA
        );
        if (args.length != 2){
            System.err.println("Usage :E06_ProcessFile3 path date ");
            return;
        }

        long tmp = 0;
        df.setLenient(false);
        try {
            tmp = df.parse(args[1]).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
        final  long modTime = tmp;
        new ProcessFiles(new ProcessFiles.Strategy() {
            @Override
            public void process(File file) {
                if (modTime < file.lastModified())
                    System.out.println(file);
            }
        },"java").start(new String[]{args[0]});
    }
}

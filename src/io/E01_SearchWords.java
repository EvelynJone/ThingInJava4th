package io;

import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zhaoxl
 * @date 2017/8/3
 */
public class E01_SearchWords {
    public static void main(final String[] args) {
        File path = new File("G:\\mine projects\\ThinkInJava4th\\src\\io");
        String[] list;
        if (args.length == 0)
            list = path.list();
        else
            list = path.list(new FilenameFilter() {
                private String ext = args[0].toLowerCase();

                @Override
                public boolean accept(File dir, String name) {
                 return false;
                }
            });
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}

package io;

import java.io.File;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-04-13
 * Time: 0:07
 */
public class Demo3 {
    public static void main(String[] args) {
        File directory1 = new File("./test/demo/io/file/mkdirs");
        directory1.mkdirs();
        System.out.println(directory1.isDirectory());

        File directory2 = new File("./test");
        String[] result = directory2.list();
        System.out.println(Arrays.toString(result));

        File directory3 = new File("./test/aaa");
        File directory4 = new File("./test/111");
        directory3.renameTo(directory4);
        result = directory2.list();
        System.out.println(Arrays.toString(result));

        deleteDirectory(directory2);
    }

    /**
     * 在Java中，如果目录不为空，即目录中存在文件或子目录，则不能直接使用 delete() 方法删除目录。
     * 可以使用递归的方式删除目录中的所有文件和子目录，然后再删除目录本身。
     * @param directory
     */
    public static void deleteDirectory(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    deleteDirectory(file);
                }
            }
        }
        directory.delete();
    }
}

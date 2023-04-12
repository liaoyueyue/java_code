package io;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-04-13
 * Time: 0:04
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.txt");
        file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        file.delete();
    }
}

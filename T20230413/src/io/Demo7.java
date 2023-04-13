package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-04-13
 * Time: 21:34
 */
public class Demo7 {
    public static void main(String[] args) throws IOException {
        //使用字符输出流来写文件
        Writer writer = new FileWriter("./text.txt");
        writer.write("hello world");
        writer.close();
    }
}

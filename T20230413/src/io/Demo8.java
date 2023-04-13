package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-04-13
 * Time: 21:38
 */
public class Demo8 {
    public static void main(String[] args) throws IOException {
        //使用scanner来打印文本
        InputStream inputStream = new FileInputStream("./text.txt");
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        inputStream.close();
    }
}

package io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-04-13
 * Time: 21:30
 */
public class Demo6 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("./text.txt");   //字符输入流
        while (true) {
            int ret = reader.read();
            if (ret == -1) {
                break;
            }
            char ch = (char) ret;
            System.out.println(ch);
        }
        reader.close();
    }
}

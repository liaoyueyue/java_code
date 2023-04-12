package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-04-13
 * Time: 1:40
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("HelloWorld.txt");
        while (true) {
            int b = inputStream.read(); //read读一个字节
//            流读到最后会返回-1
            if (b == -1) {
                break;
            }
            System.out.println(b);
        }
        inputStream.close();
    }
}

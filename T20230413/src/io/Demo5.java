package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-04-13
 * Time: 21:24
 */
public class Demo5 {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("./text.txt");  //字节输出流
        outputStream.write(97);
        outputStream.write(98);
        outputStream.write(99);
        outputStream.close();
    }
}

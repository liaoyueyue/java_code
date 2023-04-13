package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-04-13
 * Time: 21:42
 */
public class Demo9 {
    public static void main(String[] args) throws IOException {
        //使用printWriter,写文本文件
        OutputStream outputStream = new FileOutputStream("./text.txt");
        PrintWriter writer = new PrintWriter(outputStream);
        writer.println();
        writer.printf("nihao shijie");
        writer.flush();
        outputStream.close();
    }

    /**
     *  PrintWriter 类的步骤：
     * 创建 PrintWriter 对象：使用 PrintWriter 类之前，你需要先创建 PrintWriter 对象，并将其与要写入的文件或输出流关联。
     * 写入数据：在创建 PrintWriter 对象之后，你可以使用其提供的方法将数据写入到文件或输出流中。常用的方法包括 println()、printf()、format() 等。
     * 刷新缓冲区：在写入数据时，PrintWriter 会将写入的数据缓存在内存中。如果你想将这些数据立即写入到文件或输出流中，你可以调用 flush() 方法，强制它将缓冲区的内容写入到文件或输出流中。
     */
}

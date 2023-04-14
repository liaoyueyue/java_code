package program;

import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:复制文件的小程序
 * User: liaoyueyue
 * Date: 2023-04-14
 * Time: 15:52
 */
public class CopyFile {
    public static void main(String[] args) {
//        1. 确定源文件和目的路径
        Scanner scanner = new Scanner(System.in);
        System.out.println("这里是复制文件的小程序");
        System.out.println("请输入源文件路径");
        File srcFile = new File(scanner.next());
        System.out.println("请输入目的文件路径");
//        destination 目的地
        File destFile = new File(scanner.next());
        if (!srcFile.isFile()) {
            System.out.println("输入的源文件有误");
            return;
        }
        if (!destFile.getParentFile().isDirectory()) {
            System.out.println("输入的目的文件有误");
            return;
        }
//        2. 开始复制,采用输入输出字节流
        try (InputStream inputStream = new FileInputStream(srcFile);
             OutputStream outputStream = new FileOutputStream(destFile)) {
            while (true) {
                int ret = inputStream.read();
                if (ret == -1) {
                    return;
                }
                outputStream.write(ret);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

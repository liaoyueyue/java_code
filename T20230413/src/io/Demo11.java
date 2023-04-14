package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:查找路径内的指定内容
 * User: liaoyueyue
 * Date: 2023-04-14
 * Time: 22:16
 */
public class Demo11 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入查找路径");
        File path = new File(scanner.next());
        if (!path.isDirectory()) {
            System.out.println("不存在该目录");
            return;
        }
        System.out.println("请输入查找的内容");
        String content = scanner.next();
        scanDir(path, content);
    }

    private static void scanDir(File path, String content) throws IOException {
        System.out.println("当前访问: " + path.getCanonicalPath());
        File[] files = path.listFiles();
        if (files == null) {
            return;
        }
        for (File f :
                files) {
            if (f.isDirectory()) {
                scanDir(f, content);
            } else {
                checkContent(f, content);
            }
        }
    }

    private static void checkContent(File f, String content) throws IOException {
        if (f.getName().contains(content)) {
            System.out.println("文件名: " +content + "存在于" + f.getCanonicalPath());
        }
        try(InputStream inputStream = new FileInputStream(f)) {
            StringBuilder stringBuilder = new StringBuilder();
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine() + "\n");
            }
            if (stringBuilder.indexOf(content) > -1) {
                System.out.println("文件内容: " +content + "存在于" + f.getCanonicalPath());
            }
        }
    }
}

package io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:扫描指定目录，并找到名称中包含指定字符的所有文件（不包括目录），并且后续需要询问用户是否要删除文件
 * User: liaoyueyue
 * Date: 2023-04-13
 * Time: 21:54
 */
public class Demo10 {
    public static void main(String[] args) throws IOException {
        //1. 用户输入指定字符
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要扫描的路径:");
        File path = new File(scanner.next());
        if (!path.isDirectory()) {
            System.out.println("输入的目录不存在");
            return;
        }
        System.out.println("请输入需要搜索的关键词:");
        String toDelete = scanner.next();
        //2. 遍历目录,核心方法listFiles()
        scanDir(path, toDelete);
        //3. 确认是否删除
    }

    private static void scanDir(File path, String toDelete) throws IOException {
        System.out.println("当前访问: " + path.getCanonicalPath());
        File[] files = path.listFiles();
        if (files == null) {
            //空目录
            return;
        }
        for (File f : files) {
            if (f.isDirectory()) {
                //是目录继续递归
                scanDir(f, toDelete);
            } else {
                //不是目录就判断是否包含指定字符
                checkDelete(f, toDelete);
            }
        }
    }

    private static void checkDelete(File f, String toDelete) throws IOException {
        if (f.getName().contains(toDelete)) {
            System.out.println("该单词" + toDelete + "被" + f.getCanonicalPath() + "包含了，是否要删除?(Y/N)");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            if (choice.equals("Y") || choice.equals("y")) {
                f.delete();
            }
        }
    }
}

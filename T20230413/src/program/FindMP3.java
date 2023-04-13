package program;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/**
 * Created with IntelliJ IDEA.
 * Description:查找选择路径下的所有.mp3的文件
 * User: liaoyueyue
 * Date: 2023-04-13
 * Time: 22:26
 */
public class FindMP3 {
    private static final String EXTENSION = ".mp3";
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        System.out.println("欢迎使用本程序来查询扩展名为.mp3的文件");
        System.out.println("请输入需要查找的路径:");
        Scanner scanner = new Scanner(System.in);
        File path = new File(scanner.next());
        if (!path.isDirectory()) {
            System.out.println("目录不存在");
        }
        //开始扫描目录
        scanDir(path);
        System.out.printf("查找完毕,一共%d个", count);
    }

    private static void scanDir(File path) throws IOException {
        File[] files = path.listFiles();
        if (files == null) {
            return;
        }
        for (File f:
             files) {
            if (f.isDirectory()) {
                scanDir(f);
            } else {
                //这里f为文件
                checkFile(f);
            }
        }

    }

    private static void checkFile(File f) throws IOException {
        if (f.getName().contains(EXTENSION)) {
            System.out.println(f.getCanonicalPath());
            count++;
        }
    }
}

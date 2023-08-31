import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-08-31
 * Time: 12:13
 */
public class TestInputStream {
    public static void main(String[] args) {
//        method1();
//        method2();
        method3();
    }

    // 在项目目录里创建hello.txt文件并填充Hello World
    private static void method1() {
        try (InputStream is = new FileInputStream("hello.txt")) {
            while (true) {
                int b = is.read();
                if (b == -1) {
                    break;
                }
                System.out.printf("%c", b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 这里我们把文件内容中填充中文看看，注意，写中文的时候使用 UTF-8 编码。hello.txt 中填写 "你好中国"
    // 注意：这里我利用了这几个中文的 UTF-8 编码后长度刚好是 3 个字节和长度不超过 1024 字节的现状，
    // 但这种方式并不是通用的
    private static void method2() {
        try (InputStream is = new FileInputStream("hello.txt")) {
            byte[] buf = new byte[1024];
            int len;

            while (true) {
                len = is.read(buf);
                if (len == -1) {
                    // 文件已经全部读完
                    break;
                }

                // 每次使用3字节进行 utf-8 解码获取中文字符
                // 利用String 中的构造方法完成
                for (int i = 0; i < len; i += 3) {
                    String s = new String(buf, i, 3, "UTF-8");
                    System.out.printf("%s", s);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // 在hello.txt 中填写 "你好中国"
    private static void method3() {
        try (InputStream is = new FileInputStream("hello.txt")) {
            try (Scanner scanner = new Scanner(is, "utf-8")) {
                while (scanner.hasNext()) {
                    String s = scanner.next();
                    System.out.print(s);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

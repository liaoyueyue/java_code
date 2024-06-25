package iostream;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-06-22
 * Time: 1:04
 */
public class TestStream2 {
    public static void main(String[] args) {
        File file = new File("./test1.txt");
        Reader reader = null;

        // 读取单个字符
        try {
            reader = new InputStreamReader(new FileInputStream(file));
            int tempchar;
            while ((tempchar = reader.read()) != -1) {
                if ((char) tempchar != '\r') {
                    System.out.print((char) tempchar);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 读取多个字符
        try {
            char[] tempchars = new char[2];
            int charread = 0;
            reader = new InputStreamReader(new FileInputStream(file));
            while ((charread = reader.read(tempchars)) != -1) {
                for (int i = 0; i < charread; i++) {
                    if (tempchars[i] != '\r') {
                        System.out.print(tempchars[i]);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

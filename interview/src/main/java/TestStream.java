import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-06-21
 * Time: 22:06
 */
public class TestStream {
    public static void copyFileByBytes(String inFile, String outFile) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        byte[] tempbytes = new byte[100];
        int byteread = 0;
        try {
            inputStream = new FileInputStream(inFile);
            outputStream = new FileOutputStream(outFile);
            while ((byteread = inputStream.read(tempbytes)) != -1) {
                outputStream.write(tempbytes, 0, byteread);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    outputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 字节输入输出流
        File file1 = new File("./test1.txt");
        File file2 = new File("./test2.txt");
        // 从 test1.txt 中读取 字符串
        InputStream is1 = null;
        try {
            is1 = new FileInputStream(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            file1.createNewFile();
        }
        StringBuilder sb1 = new StringBuilder();
        while (is1.available() > 0) {
            sb1.append((char) is1.read());
        }
        is1.close();
        System.out.println("sb1: " + sb1);

        OutputStream os1 = new FileOutputStream(file2);
        for (int i = 0; i < sb1.length(); i++) {
            os1.write(sb1.charAt(i));
        }
        os1.close();
    }
}

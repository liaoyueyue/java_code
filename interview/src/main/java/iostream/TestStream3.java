package iostream;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-07-10
 * Time: 22:52
 */
public class TestStream3 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test1.txt");
        Writer writer = new FileWriter("test2.txt");
        char[] buf = new char[1024];
        int numRead = 0;
        while ((numRead = reader.read(buf)) != -1) {
            writer.write(buf, 0, numRead);
        }
        reader.close();
        writer.close();
    }
}

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-08-31
 * Time: 13:18
 */
public class TestPrintWriter {
    public static void main(String[] args) {
        try(OutputStream os = new FileOutputStream("output.txt")) {
            try (OutputStreamWriter osWriter = new OutputStreamWriter(os, "utf-8")) {
                try(PrintWriter printWriter = new PrintWriter(osWriter)) {
                    printWriter.println("我是第一行");
                    printWriter.println("我是第二行");
                    printWriter.println("我是第三行");
                    printWriter.flush();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

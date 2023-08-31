import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-08-31
 * Time: 12:54
 */
public class TestOutputStream {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
        method4();
    }

    private static void method1() {
        try (OutputStream os = new FileOutputStream("output.txt")) {
            os.write('H');
            os.write('e');
            os.write('l');
            os.write('l');
            os.write('o');
            os.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void method2() {
        try (OutputStream os = new FileOutputStream("output.txt")) {
            byte[] b = new byte[]{
                    'G', 'o', 'o', 'd'
            };
            os.write(b);
            os.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void method3() {
        try (OutputStream os = new FileOutputStream("output.txt")) {
            String s = "nice";
            byte[] b = s.getBytes();
            os.write(b);
            os.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void method4() {
        try (OutputStream os = new FileOutputStream("output.txt")) {
            String s = "你好中国";
            byte[] b = s.getBytes("utf-8");
            os.write(b);
            os.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

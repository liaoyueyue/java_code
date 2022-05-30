import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-30
 * Time: 21:11
 */
public class Test_Config {
    File file;
    public void openConfig(String filename) throws FileNotFoundException {
        if (filename.equals("config.ini")) {
            throw new FileNotFoundException("配置文件名错误");
        }
    }

    public void readConfig() {

    }

    public static void main(String[] args) {
        Test_Config config = new Test_Config();
        try {
            //尝试的代码
            config.openConfig("config.ini");
            System.out.println("文件打开成功");
        } catch (IOException e) {
            //异常的处理方式
            System.out.println(e.getMessage());// 只打印异常信息
            System.out.println(e);// 打印异常类型：异常信息
            e.printStackTrace();// 打印信息最全面
        }
        //如果异常被捕获处理了，这里的代码才会执行
        System.out.println("异常被捕获后的代码");
    }
}

/**
 * 1. try块内抛出异常位置之后的代码将不会被执行
 * 2. 如果抛出异常类型与catch时异常类型不匹配，即异常不会被成功捕获，也就不会被处理，继续往外抛，直到
 * JVM收到后中断程序----异常是按照类型来捕获的
 */

package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-04-21
 * Time: 23:09
 */
public class TcpEchoClient {
    //客户端需要这个socket来建立连接
    Socket socket = null;

    public TcpEchoClient(String serverIP, int serverPort) throws IOException {
        //和服务器建立连接
        socket = new Socket(serverIP, serverPort);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        try(InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream()) {
            while (true) {
                //1. 从控制台读取数据，构成一个请求
                System.out.println("->");
                String request = scanner.next();
                //2. 发送请求个服务器
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.println(request);
                printWriter.flush();    //这里不能忘记，否则请求可能没有发送出去
                //3. 从服务器读取响应
                Scanner respScanner = new Scanner(inputStream);
                String response = respScanner.next();
                //4. 把响应显示在屏幕上
                System.out.println(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        TcpEchoClient tcpEchoClient = new TcpEchoClient("127.0.0.1", 9090);
        tcpEchoClient.start();
    }

}

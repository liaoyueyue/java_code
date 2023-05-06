package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-04-09
 * Time: 22:34
 */
public class TcpEchoServer {
    //本类涉及多个socket对象，用不同的名字区分
    private ServerSocket listenSocket = null;

    public TcpEchoServer(int port) throws IOException {
        listenSocket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动");
        ExecutorService service = Executors.newCachedThreadPool();
        while (true) {
            //先调用accept来接受客服端的链接
            Socket clientSocket = listenSocket.accept();
            //再处理这个连接,这里应该使用多线程，每个客户端连接上来都分配一个新的线程负责处理
//            Thread t = new Thread(() -> {
//                try {
//                    processConnection(clientSocket);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
//            t.start();
            service.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        processConnection(clientSocket);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });


        }
    }

    private void processConnection(Socket clientSocket) throws IOException {
        System.out.printf("[%s:%d] 客户端上线!\n", clientSocket.getInetAddress(), clientSocket.getPort());
        //处理客户端请求
        try (InputStream inputStream = clientSocket.getInputStream();
             OutputStream outputStream = clientSocket.getOutputStream()) {
            while (true) {
                //1. 读取请求并解析
                Scanner scanner = new Scanner(inputStream);
                if (!scanner.hasNext()) {
                    //读完就断开
                    System.out.printf("[%s:%d] 客户端下线！\n", clientSocket.getInetAddress(), clientSocket.getPort());
                    break;
                }
                String request = scanner.next();
                //2. 根据请求计算响应
                String response = process(request);
                //3. 把响应写回客户端
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.println(response);
                //刷新缓存区确保数据确实是通过网卡发送出去了
                printWriter.flush();
                System.out.printf("[%s:%d] req: %s; resp: %s\n", clientSocket.getInetAddress(), clientSocket.getPort(), request, response);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            clientSocket.close();
        }
    }

    private String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        TcpEchoServer server = new TcpEchoServer(9090);
        server.start();
    }
}

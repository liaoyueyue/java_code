import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created with IntelliJ IDEA.
 * Description:回显服务端
 * User: liaoyueyue
 * Date: 2023-04-05
 * Time: 21:34
 */
public class UdpEchoServer {
    private DatagramSocket socket = null;

    /**
     * 参数的端口表示服务器需要绑定的端口
     * @param port
     * @throws SocketException
     */
    public UdpEchoServer(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }

    //这个方法启动服务器
    public void start() throws IOException {
        System.out.println("服务器启动");
        while (true) {
            //循环里处理一次请求
            //1、读取请求并解析
            DatagramPacket requestPacket = new DatagramPacket(new byte[4096], 4096);    //创建数据报并配置大小
            socket.receive(requestPacket);  //这里的.receive是接受到的数据放入数据报requestPacket内
            String request = new String(requestPacket.getData(), 0, requestPacket.getLength()); //把DatagramPacket对象转化为字符串，方便去打印
            //2、根据请求计算并响应
            String response = process(request); //response 回复/响应、 process 过程
            //3、把响应写回客户端
            DatagramPacket responsePacket = new DatagramPacket(response.getBytes(), response.getBytes().length, requestPacket.getSocketAddress());    //.getBytes()是把字符串转化为字节数组
            socket.send(responsePacket);
            //4、打印一个日志，记录当前的情况
            System.out.printf("[%s:%d] req: %s; resp: %s\n", requestPacket.getAddress().toString(), requestPacket.getPort(), request, response);
        }
    }

    public String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        UdpEchoServer server = new UdpEchoServer(9090);
        server.start();
    }
}

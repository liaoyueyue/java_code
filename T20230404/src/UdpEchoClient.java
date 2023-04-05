import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:回显客户端
 * User: liaoyueyue
 * Date: 2023-04-05
 * Time: 23:06
 */
public class UdpEchoClient {
    private DatagramSocket socket = null;

    //下面两个参数在发送数据的时候用到
    private String serverIP;
    private int serverPort;

    public UdpEchoClient(String serverIP, int serverPort) throws SocketException {
        socket = new DatagramSocket();  //这里不是没有端口而是让系统自动分配端口
        this.serverIP = serverIP;
        this.serverPort = serverPort;
    }

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //1. 从控制台读取用户输入内容
            System.out.print("->");
            String request = scanner.next();
            //2. 构造一个UDP请求发送给服务端
            DatagramPacket requestPacket = new DatagramPacket(request.getBytes(), request.getBytes().length, InetAddress.getByName(serverIP), this.serverPort);
            socket.send(requestPacket);
            //3. 从服务端读取UDP响应数据并解析
            DatagramPacket respondPacket = new DatagramPacket(new byte[4096], 4096);
            socket.receive(respondPacket);
            String respond = new String(respondPacket.getData(), 0, respondPacket.getLength());
            //4. 把服务端的响应显示到控制台上
            System.out.println(respond);
        }
    }

    public static void main(String[] args) throws IOException {
        UdpEchoClient client = new UdpEchoClient("127.0.0.1", 9090);
        client.start();
    }
}

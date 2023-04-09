package udp;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-04-09
 * Time: 21:09
 */
public class UdpTranslateServer extends UdpEchoServer{
    private Map<String, String> dict = new HashMap<>();

    /**
     * 参数的端口表示服务器需要绑定的端口
     *
     * @param port
     * @throws SocketException
     */
    public UdpTranslateServer(int port) throws SocketException {
        super(port);

        dict.put("cat", "小猫");
        dict.put("dog", "小狗");
        dict.put("fuck", "握草");
    }

    @Override
    public String process(String request) {
        return dict.getOrDefault(request, "词在词典中没有查到");
    }

    public static void main(String[] args) throws IOException {
        UdpTranslateServer server = new UdpTranslateServer(9090);
        server.start();
    }
}

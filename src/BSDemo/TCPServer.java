package BSDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    创建一个BS版本TCP服务器
 */
public class TCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);

        Socket socket = server.accept();

        InputStream is = socket.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = br.readLine();

        String htmlPath = line.split(" ")[1].substring(1);

        FileInputStream fis = new FileInputStream(htmlPath);

        OutputStream os = socket.getOutputStream();

        os.write("HTTP/1.1 200 OK\r\n".getBytes());

        os.write("Content-Type:text/html\r\n".getBytes());

        os.write("\r\n".getBytes());

        int len;

        byte[] bytes = new byte[1024];

        while ((len = fis.read(bytes)) != -1){
            os.write(bytes, 0, len);
        }

        fis.close();
        socket.close();
        server.close();

    }
}

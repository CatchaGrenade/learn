package BSDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    创建一个BS版本TCP服务器
 */
public class TCPServerThread {

    public static void main(String[] args) throws IOException {
        //http://127.0.0.1:8080/web/index.html
        ServerSocket server = new ServerSocket(8080);

        while (true) {
            Socket socket = server.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();

                        BufferedReader br = new BufferedReader(new InputStreamReader(is));

                        String line = br.readLine();

                        System.out.println(line);

                        String htmlPath = line.split(" ")[1].substring(1);

                        try{
                            FileInputStream fis = new FileInputStream(htmlPath);
                            OutputStream os = socket.getOutputStream();

                            os.write("HTTP/1.1 200 OK\r\n".getBytes());

                            os.write("Content-Type:text/html\r\n".getBytes());

                            os.write("\r\n".getBytes());

                            int len;

                            byte[] bytes = new byte[1024];

                            while ((len = fis.read(bytes)) != -1) {
                                os.write(bytes, 0, len);
                            }

                            fis.close();
                        }catch (IOException e){
                            System.out.println("读取文件错误： " + e);
                        }
                        socket.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
        }

    }
}

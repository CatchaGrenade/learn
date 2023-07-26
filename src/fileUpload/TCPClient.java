package fileUpload;

import java.io.*;
import java.net.Socket;

/*
       读取本地文件上传服务器， 在读取服务器返回的数据
        数据源：fileUpload_tmpfile/1/vue.js
        目的地： 服务器
 */
public class TCPClient {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\javaInterviewQuestions\\src\\fileUpload_tmpfile\\1\\vue.js");

        Socket socket = new Socket("127.0.0.1", 8888);

        OutputStream os = socket.getOutputStream();

        int len;

        byte[] bytes = new byte[1024];

        while ((len = fis.read(bytes)) != -1){
            os.write(bytes, 0, len);
        }

        //手动写入一个文件结束标记，不写的话服务的的read将读不到结束标记，while就一直循环
        /*
            public void shutdownOutput()
                    throws IOException
                    禁用此套接字的输出流。对于 TCP 套接字，任何以前写入的数据都将被发送，
                    并且后跟 TCP 的正常连接终止序列。
                    如果在套接字上调用 shutdownOutput() 后写入套接字输出流，则该流将抛出 IOException。
         */
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();

        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }

        fis.close();
        socket.close();

    }
}

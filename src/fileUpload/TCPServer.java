package fileUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/*
    文件上传的服务端， 接收客户端传过来的文件， 并保存到服务器硬盘，并给客户端返回上传成功
    上传至E:\javaInterviewQuestions\src\fileUpload_tmpfile\2\vue.js
 */
public class TCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);

        while (true){
            Socket socket = server.accept();

            /*
                使用多线程提高程序效率
                有一个客户上传文件就开启一个线程， 完成文件上传
             */
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            try{
                                InputStream is = socket.getInputStream();

                                File file = new File("E:\\javaInterviewQuestions\\src\\fileUpload_tmpfile\\2");
                                if(!file.exists()){
                                    boolean bl = file.mkdirs();
                                    if (bl)
                                        System.out.println("文件夹创建成功");
                                }

                                FileOutputStream fos = new FileOutputStream(file +"\\"+ UUID.randomUUID().toString().replace("-", "") +".js");

                                int len;

                                byte[] bytes = new byte[1024];

                                while ((len = is.read(bytes)) != -1){
                                    fos.write(bytes, 0, len);
                                }

                                socket.getOutputStream().write("上传成功".getBytes(StandardCharsets.UTF_8));

                                fos.close();
                                socket.close();
//                              server.close();
                            }catch (IOException e){
                                System.out.println();
                            }
                        }
                    }
            ).start();
        }
    }
}

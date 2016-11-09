package tw.org.iii.javatest;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

// client: send file
public class Will42 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            Socket socket = new Socket(InetAddress.getByName("10.2.24.106"), 9999);
            FileInputStream fin = new FileInputStream("dir1/test123.jpg");
            OutputStream out = socket.getOutputStream();
            int b;
            while ((b = fin.read()) != -1) {
                out.write(b);
            }
            fin.close();
            out.flush();
            out.close();

//            BufferedOutputStream bout = new BufferedOutputStream(
//                    socket.getOutputStream());
//            bout.write("你好阿!!\n".getBytes());
//            bout.flush();
//            bout.close();

            socket.close();
            System.out.println("OK");
            System.out.println(System.currentTimeMillis() - start);
        } catch (Exception ee) {
            System.out.println("Client Exception : " + ee.toString());
        }
    }
}

package tw.org.iii.javatest;

import sun.awt.InputMethodSupport;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// server
public class Will43 {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9999);
            System.out.println("listen.....");
            Socket socket = server.accept();

            String urip = socket.getInetAddress().getHostAddress();
            System.out.println("ip : " + urip);

            FileOutputStream fout = new FileOutputStream("upload/" + urip + ".jpg");
            InputStream in = socket.getInputStream();
            int b;
            while ((b = in.read()) != -1) {
                fout.write(b);
            }
            in.close();

//            BufferedReader br = new BufferedReader(
//                    new InputStreamReader(socket.getInputStream()));
//
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//            br.close();

            server.close();
            System.out.println("Server OK");
        } catch (Exception e) {

        }

    }
}

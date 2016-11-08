package tw.org.iii.javatest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Will41 {
    public static void main(String[] args) {
        String mesg = "HELLO World!!";
        byte[] data = mesg.getBytes();
        try {
            DatagramSocket socket = new DatagramSocket();
            DatagramPacket packet = new DatagramPacket(
                    data, data.length, InetAddress.getByName("10.2.24.106"), 8888);
            socket.send(packet);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

package tw.org.iii.javatest;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Will47 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://127.0.0.1/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.connect();

            BufferedReader buf = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line = buf.readLine();
            buf.close();

            System.out.println(line);
            System.out.println("finish");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
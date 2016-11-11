package tw.org.iii.javatest;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Will46 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://pdfmyurl.com/?url=http://tw.yahoo.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.connect();
            InputStream in = conn.getInputStream();
            FileOutputStream fout = new FileOutputStream("upload/yahoo.pdf");
            byte[] buf = new byte[4096];
            int len;
            while ((len = in.read(buf)) != -1) {
                fout.write(buf, 0, len);
            }
            fout.flush();
            fout.close();
            in.close();
            System.out.println("finish");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package tw.org.iii.javatest;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Will45 {
    public static void main(String[] args) {
        try {
            URL url = new URL("");
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.connect();
            urlConnection.getInputStream();;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

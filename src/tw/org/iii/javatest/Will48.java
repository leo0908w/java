package tw.org.iii.javatest;

import java.io.File;
import java.io.IOException;

public class Will48 {
    public static void main(String[] args) {
        try {
            MultipartUtility mu =
                    new MultipartUtility("http://10.2.24.145/untitled/Will02.php", "utf-8");
            mu.addFilePart("upload", new File("upload/test456.jpg"));
            mu.finish();
            System.out.println("finish");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}

package tw.org.iii.javatest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Will31 {
    public static void main(String[] args) {
        try {
            File file = new File("dir1/file");
            long len = file.length();
            FileInputStream fin =
                    new FileInputStream("dir1/file");
            byte[] buf = new byte[(int)len];
            fin.read(buf);

            fin.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }
}

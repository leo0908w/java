package tw.org.iii.javatest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Will32 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("dir1/file");
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char)c);
            }
            reader.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }
}

package tw.org.iii.javatest;

import java.io.*;

public class Will34 {
    public static void main(String[] args) {
        try {
//            FileInputStream fin =
//                    new FileInputStream("dir1/file");
//            InputStreamReader irs =
//                    new InputStreamReader(fin);
//            BufferedReader br =
//                    new BufferedReader(
//                            new InputStreamReader(
//                                    new FileInputStream("dir1/file")));
            BufferedReader br = new BufferedReader(
                    new FileReader("dir1/file"));

            String line;
            int i = 1;
            while ((line = br.readLine()) != null) {
                System.out.println(i++ + "." +line);
            }

            br.close();
        } catch (Exception e) {

        }
    }
}

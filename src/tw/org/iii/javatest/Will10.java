package tw.org.iii.javatest;

/**
 * Created by iii-user on 2016/11/1.
 */
public class Will10 {
    public static void main(String[] args) {
        for (int k = 0; k < 2; k++) {
            for (int i = 1; i < 10; i++) {
                for (int j = 2; j < 6; j++) {
                    int newj = j + k * 4;
                    System.out.print(newj + " x " + i + " = " + j * i + "\t");
                }
                System.out.println();
            }
        System.out.println("-------------------------------------------");
        }
    }
}

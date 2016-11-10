package tw.org.iii.javatest;

public class test_ch3_1_ok {
    public static void main(String[] args) {
        int m = 1000; int n = 495;
        for (int i = 1; i <= m; i++) {
            if (m % i == 0 && n % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}

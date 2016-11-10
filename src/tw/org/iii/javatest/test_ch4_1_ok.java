package tw.org.iii.javatest;

import java.util.Scanner;

public class test_ch4_1_ok {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("key number:");
        int[] a = new int[console.nextInt()];
        a[0] = 0; a[1] = 1;
        for (int i = 2; i < a.length; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        for (int b : a) {
            System.out.print(b + ", ");
        }
    }
}

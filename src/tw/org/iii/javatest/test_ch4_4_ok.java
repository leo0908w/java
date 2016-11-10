package tw.org.iii.javatest;

import java.util.Scanner;

public class test_ch4_4_ok {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("key number:");
        int a = console.nextInt();
        int[] number = {1, 10, 31, 33, 37, 48, 60, 70, 80};
        end : {
            for (int i = 0; i < number.length; i++) {
                if (number[i] == a) {
                    System.out.print("number[" + i + "]");
                    break end;
                }
            }
            System.out.print("-1");
        }
    }
}

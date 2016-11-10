package tw.org.iii.javatest;

public class test_ch4_3_ok {
    public static void main(String[] args) {
        int[] number = {70, 80, 31, 37, 10, 1, 48, 60, 33, 80};
        int temp = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < i; j++) {
                if (number[i] < number[j]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        for (int a : number)
        System.out.print(a + ", ");
    }
}

package tw.org.iii.javatest;

/**
 * Created by iii-user on 2016/11/1.
 */
public class Pokerv1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // 洗牌
        int[] poker = new int[52];  // poker[0] = 0~51
        for (int i=0; i<poker.length; i++) {
            int temp = (int)(Math.random()*poker.length);
            // 檢查機制
            boolean isRepeat = false;
            for (int j=0; j<i; j++) {
                if (poker[j] == temp) {
                    // 此時重複
                    isRepeat = true;
                    break;
                }
            }
            if (isRepeat) {
                i--;
            }else{
                poker[i] = temp;
                System.out.println(poker[i]);
            }
        }
        System.out.println("-------------------------------");
        System.out.println(System.currentTimeMillis() - start);
        // 發牌
        // 攤牌 (理牌)
    }
}

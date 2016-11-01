package tw.org.iii.javatest;
public class Pokerv2 {
    public static void main(String[] args) {
        // 洗牌
        int[] poker = new int[52];  // poker[0] = 0~51
        int temp;
        boolean isRepeat;
        for (int i=0; i<poker.length; i++) {
            do {
                temp = (int)(Math.random()*poker.length);
                // 檢查機制
                isRepeat = false;
                for (int j=0; j<i; j++) {
                    if (poker[j] == temp) {
                        // 此時重複
                        isRepeat = true;
                        break;
                    }
                }
            }while(isRepeat);
            poker[i] = temp;
            System.out.println(poker[i]);
        }
        System.out.println("-------------------------------");
        // 發牌
        int[][] players = new int[4][13];
        for (int i=0; i<poker.length; i++) {
            players[i%4][i/4] = poker[i];
        }
        for (int[] player : players) {
            for (int v : player) {
                System.out.print(v + "\t");
            }
            System.out.println();
        }
        // 攤牌 (理牌)
    }
}

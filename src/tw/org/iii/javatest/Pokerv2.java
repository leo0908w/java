package tw.org.iii.javatest;

import java.util.ArrayList;
import java.util.Arrays;

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
        // 攤牌 (理牌)
        String[] flower = {"黑桃", "愛心", "方塊", "梅花"};
        String[] point = {"A", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "J", "Q", "K"};
        for (int[] player : players){
            Arrays.sort(player);
            for (int card : player){
                System.out.print(flower[card/13] + point[card%13] + "  ");
//                System.out.print(card + "\t");
            }
            System.out.println();
        }
//                int flower = card / 13;
//                int point = card % 13;
//                switch (flower) {
//                    case 0: System.out.print("黑桃"); break;
//                    case 1: System.out.print("愛心"); break;
//                    case 2: System.out.print("方塊"); break;
//                    case 3: System.out.print("梅花"); break;
//                }
//                switch (point) {
//                    case 0: System.out.print("A\t"); break;
//                    case 1: System.out.print("2\t"); break;
//                    case 2: System.out.print("3\t"); break;
//                    case 3: System.out.print("4\t"); break;
//                    case 4: System.out.print("5\t"); break;
//                    case 5: System.out.print("6\t"); break;
//                    case 6: System.out.print("7\t"); break;
//                    case 7: System.out.print("8\t"); break;
//                    case 8: System.out.print("9\t"); break;
//                    case 9: System.out.print("10\t"); break;
//                    case 10: System.out.print("J\t"); break;
//                    case 11: System.out.print("Q\t"); break;
//                    case 12: System.out.print("K\t"); break;
//                }
    }
}

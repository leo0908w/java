package tw.org.iii.javatest;
public class Date_hw {
    public static void main (String[] args) {
        int year = 2016;
        int month = 11;
        int day = 3;
        int count = 0;
        int temp = 0;
        int temp2 = 0;
        int temp3 = 0;
        int temp4 = 0;
        int temp5 = 0;
        int result = 0;

//        boolean jamp = false;
        for (int i = 1; i < month; i++) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    count += 31;
//                    System.out.println("31");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
//                    System.out.println("30");
                    count += 30;
                    break;
                case 2:
                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                // 29
                                count += 29;
//                                System.out.println("29");
                            } else {
                                // 28
                                count += 28;
//                                System.out.println("28");
                            }
                        } else {
                            // 29
                            count += 29;
//                            System.out.println("29");
                        }
                    } else {
                        // 28
                        count += 28;
//                        System.out.println("28");
                    }
                    break;
            }
        }
        temp = (year - 1);
        temp2 = ((year - 1) / 4);
        temp3 = ((year - 1) / 100);
        temp4 = ((year - 1) / 400);

        System.out.println("temp: " + temp);
        System.out.println("temp2: " + temp2);
        System.out.println("temp3: " + temp3);
        System.out.println("temp4: " + temp4);

        count += day;
        System.out.println("count: " + count);
        String[] week = {"一", "二", "三", "四", "五", "六", "日"};
        result = temp + count;
//        temp2 = result % 7;
//        System.out.println("temp2: " + temp2);
        System.out.println("星期" + week[result % 7]);

    }
}








package tw.org.iii.javatest;
public class Will23 {
    public static void main(String[] args) {
//        TWId id1 = new TWId("A123456789");
        TWId id1 = new TWId();
        System.out.println(id1.getId());
        if (TWId.isCheckOK("A123456789")) {
            System.out.println("OK");
        } else {
            System.out.println("XX");
        }
    }
}

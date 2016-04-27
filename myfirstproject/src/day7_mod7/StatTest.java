package day7_mod7;

public class StatTest {

    public static void main(String[] args) {

        int rate = Count4.counter;

        //Transtion.setRate(-78);
        Transtion.setRate(rate);

        Transtion obj1 = new Transtion();

        double taka = obj1.getUsdToBdt(100);
        System.out.println("taka: " + taka);

        Transtion obj2 = new Transtion();

        Transtion.setRate(55);
        Transtion.setRate(80);
        double taka1 = obj2.getUsdToBdt(10);

        System.out.println("taka1: " + taka1);

        double taka3 = obj1.getUsdToBdt(100);
        System.out.println("taka3: " + taka3);

    }
}

class Transtion {

    private static int rate = 65;
    static String version = "10.2";

    public static void setRate(int r) {

        System.out.println("now version is " + version);
        if (r > 0) {
            rate = r;
        }
    }

    double getUsdToBdt(int usd) {
        return usd * rate;
    }
}

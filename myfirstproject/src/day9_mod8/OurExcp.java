package day9_mod8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OurExcp {

    public static void main(String[] args) {
        Util util = new Util();

        double ret = 0;
        try {
            ret = util.div(4, 0);
        } catch (OurDivExceptn ex) {
            //System.out.println("err: vager: " + ex.);
        }

        System.out.println("ret: " + ret);
    }
}

class Util {

    double div(int a, int b) throws OurDivExceptn {

        if (b == 0) {
            throw new OurDivExceptn(a, b);
        }

        return a / b;
    }
}

class SubUtil extends Util {

    @Override
    double div(int a, int b) throws SubOurDivExceptn {

        if (b == 0) {
            throw new SubOurDivExceptn();
        }

        return a / b;
    }
}

class OurDivExceptn extends Exception {

    private int vager;

    public OurDivExceptn() {
    }

    public OurDivExceptn(int a, int b) {
        super("are vi vag koro zero diye, tumi " + a + " ke 0 diye vag koro, fawl!");
        vager = a;
    }

}

class SubOurDivExceptn extends OurDivExceptn {

    int vager;

    public SubOurDivExceptn() {

    }

}

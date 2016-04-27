package day8_mod7_full;

public class NewClass {

    public static void main(String[] args) {
        Emp e1 = new Emp("Maudud", Salutation.MR);
        Emp e2 = new Emp("Putul", Salutation.MRS);
        Emp e3 = new Emp("Anisa", Salutation.MISS);

        System.out.println("" + e1);
        System.out.println("" + e2);
        System.out.println("" + e3);
    }
}

class Emp {

    String nam;
    Salutation gender;

    public Emp(String nam, Salutation gender) {
        this.nam = nam;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return nam + " is a " + gender;
    }
}

enum Salutation {

    MR("Man", "MALE"),
    MISS("Girl", "FEMALE"),
    MRS("Woman", "FEMALE");

    private final String name;
    private final String mf;

    private Salutation(String sss, String mf) {
        name = sss;
        this.mf = mf;
    }

    @Override
    public String toString() {
        return name + "(" + mf + ")";
    }
}

package day4_pass_val_mod4;

public class NewClass {

    public static void main(String[] args) {

        int a = 6;

        int r = a >> 2;

        System.out.println("rrr: " + r); //110

        Dog d = new Dog("Tom");
        d.setAge(33);
//        d.age = -22;

        //d.whatIsUrName();
        //d.whatIsUrAge();
        d.whatIsUrDetailInfo();

    }
}

class Dog {

    private String name;
    private int age;

    void setAge(int age) {

        if (age > 0 && age <= 50) {
            this.age = age;
        }

    }

    Dog(String name) {
        this.name = name;
    }

    void whatIsUrDetailInfo() {
        whatIsUrName();
        whatIsUrAge();
    }

    void whatIsUrName() {
        System.out.println("My name vey vey " + name);
    }

    void whatIsUrAge() {
        int uuuu = 4;

        System.out.println("yyyyy" + uuuu);

        System.out.println("My age vey vey " + age);
    }
}

package day6_mod6;

public class TestClass {

    public static void main(String[] args) {
        Object e1 = new Emp("Anis", "MALE");

        if (e1 instanceof Person) {
            Person e = (Person) e1;
            //e.name = "Anis";
            //e.gender = "MALE";
        }

        if (e1 instanceof Emp) {
            Emp e = (Emp) e1;
            e.setSal(1300);
//            e.sal = 1300;
        }

        if (e1 instanceof Man) {
            Man e = (Man) e1;
            e.setDept("Inventory");
            //e.dept = "Software";
        }

        System.out.println(e1);

    }
}

class Person {

    private String name;
    private String gender;

    Person() {
    }

    Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String toString() {
        return "PERSON: " + name + " is a " + gender + "\n";
    }
}

class Emp extends Person {

    private double sal;

    Emp() {
    }

    Emp(String name, String gender) {
        this(name, gender, 1200);
    }

    Emp(String name, String gender, double sal) {
        super(name, gender);
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        if (sal > 0) {
            this.sal = sal;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "EMP: " + "Salary: " + sal + "\n";
    }
}

class Man extends Emp {

    private String dept;

    Man() {

    }

//    Man(String name, String gender) {
//        super(name, gender);
//    }
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String toString() {
        return super.toString() + "MAN: dept: " + dept;
        //return "Name " + name + " is a " + gender + " get Salary " + sal+" manager of "+dept;
    }
}

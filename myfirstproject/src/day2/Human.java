package day2;

import java.util.Date;

public class Human {

    private String name;
    private String fatherName;
    private String ff;
    private int age;

    Human() {
        // name = "UnKNOWN";
    }

    public void ghoriDekheTimeBolo() {
        Date tt = new Date();
        System.out.println("Now time is " + tt);
    }

    /**
     * gfdgdfg gdfg fgdgdg gdfgdg
     */
    public void askName() {
        System.out.println("My name is " + name);
    }

    public void askDetail() {
        askName();
        if (age <= 0) {
            System.out.println("My age is 'DONT ASK'");
        } else {
            System.out.println("My age is " + age);
        }
        System.out.println("My Fathers Name is " + fatherName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 2) {
            this.name = "Invalid NAME";
        } else {
            this.name = name;
        }
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setAge(int i) {
        if (i >= 0 && i <= 100) {
            age = i;
        } else {
            System.out.println("in valid age");
            System.out.println("not assigned");
        }

    }

}

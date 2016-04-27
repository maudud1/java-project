/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8_mod7_full;

/**
 *
 * @author mbadiuzzaman
 */
public class IntfAbst {

    public static void main(String[] args) {
        //Animal mm = new Animal();
        Animal mm = new Fish();

        mm.breath();
        mm.eat();
    }
}

abstract class Animal {

    abstract void eat();

    abstract void breath();
}

abstract class AnimalLand extends Animal {

    void breath() {
        System.out.println("lunghs breathing");
    }
}

abstract class AnimalFly extends AnimalLand {

    void breath() {
        System.out.println("lunghs breathing");
    }
}

abstract class AnimalWater extends Animal {

    void eat() {
        System.out.println("eating with mouth, have no hand");
    }

    void breath() {
        System.out.println("fulka breathing");
    }
}

class Monkey extends AnimalLand {

    void eat() {
        System.out.println("eating WITH hand mode");
    }
}

class Dog extends AnimalLand {

    void eat() {
        System.out.println("eating NO hand mode");
    }
}

class Fish extends AnimalWater {

}

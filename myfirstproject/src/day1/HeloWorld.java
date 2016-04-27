/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

public class HeloWorld {

    public static void main(String[] args) {

        Emp emp = new Emp();
        emp.callMe();

        System.out.println("ret: " + emp.calcAdd(2, 5));

        //for (int i = 0; i < 7; i++) {
        //    System.out.println("welcome to java " + i);
        //}
    }

}


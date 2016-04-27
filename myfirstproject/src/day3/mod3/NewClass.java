/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.mod3;

/**
 *
 * @author mbadiuzzaman
 */
public class NewClass {

    public static void main(String[] args) {

        double motNumber = Math.pow(2, 16);

        System.out.println("" + motNumber);
        
        for (int i = 0; i < motNumber; i++) {
            System.out.println(i+" "+(char) i);
        }
        
        

    }
}

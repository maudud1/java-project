/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_recap_pass_by_val_mod5_array;

/**
 *
 * @author mbadiuzzaman
 */
public class NewClass1 {

    public static void main(String[] args) {

        kkkk:
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");

                if (j == 3) {
                    System.out.println("OOO");
                    continue kkkk;
                }
            }

            System.out.println("");
        }

    }
}

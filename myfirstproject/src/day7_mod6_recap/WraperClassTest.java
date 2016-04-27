/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7_mod6_recap;

/**
 *
 * @author mbadiuzzaman
 */
public class WraperClassTest {

    public static void main(String[] args) {

        int u = 11;
        Integer ii = new Integer("34");

        //double ddd= Double.parseDouble("23.12");
        double ddd = new Double("23.12");

        double ret = u + ii + ddd;

        System.out.println(ret);
    }
}

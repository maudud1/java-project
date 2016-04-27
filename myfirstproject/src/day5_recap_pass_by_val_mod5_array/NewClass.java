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
public class NewClass {

    public static void main(String[] args) {
        Pass ppp = new Pass();

        //int outer = 22;
        MyDat outer = new MyDat(2, 10, 2015);
        ppp.chngObject(outer);
        
        //outer.setDay(22);

        System.out.println("outer:" + outer);
    }
}

class Pass {

    void chngObject(final MyDat val) {
        //val = new MyDat(11, 10, 2015);
        
        val.setDay(17);
    }

    void chngInt(final int val) {
        //val = 44;
        
        
        //gfdgd
        //gdfg
        
        
        
        
        
        
        
        
        
        
        
        
    }
}

class MyDat {

    int d, m, y;

    public MyDat(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    void setDay(int d) {
        d = d;
    }

    @Override
    public String toString() {
        return d + "/" + m + "/" + y;
    }

}

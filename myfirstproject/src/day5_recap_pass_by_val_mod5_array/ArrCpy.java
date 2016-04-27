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
public class ArrCpy {

    public static void main(String[] args) {

        //original array
        int[] myArray = {1, 2, 3, 4};

        // new larger array
        int[] hold = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

 // copy all of the myArray array to the hold
        // array, starting with the 0th index
        System.arraycopy(myArray, 0, hold, 2, 4);
        
        System.out.println("lll:"+myArray.length);
        
        for (int i : hold) {
            System.out.print(""+i+", ");
        }

    }
}

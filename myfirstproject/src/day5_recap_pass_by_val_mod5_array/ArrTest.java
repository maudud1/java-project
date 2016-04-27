
package day5_recap_pass_by_val_mod5_array;

public class ArrTest {
    
    public static void main(String[] args) {
        
        
        char [] chrr=new char[30];
        
        int ind=0;
        
        for (int i = 945; i < 945+chrr.length; i++) {
            chrr[ind]=(char) i;
            ind++;
        }
        
        System.out.println(""+chrr);
        
        for (char d : chrr) {
            System.out.println(""+d);
        }
        
        
    }
    
    
    
}

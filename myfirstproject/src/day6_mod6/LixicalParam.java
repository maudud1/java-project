
package day6_mod6;

public class LixicalParam {
    
    public static void main(String[] args) {
        MyUtil mm=new MyUtil();
        System.out.println("sum: "+mm.sum(1,2,3,4,5));
    }
}

class MyUtil{

    int sum(int... vals){
        int sum=0;
        for (int val : vals) {
            sum+=val;
        }
        return sum;
    }
}
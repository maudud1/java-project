package day9_mod8;

import java.io.FileReader;

public class NewClass {

    public static void main(String[] args) {

        
        int rrr=(int) (5.0/4.0);
        
        System.out.println("pppppppppppp"+rrr);
        
        try {
            FileReader kkkk=new FileReader("D:\\hkhhkh.txt");
            System.out.println("okk");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("err xyfile: "+e);
        }
        
        
        String jjjj="";
        
        //char iip=jjjj;
        
        //System.out.println("kotha: "+iip);
        
        
        System.out.println("okfirstline");

        //double k= 1/0;
        int j = 0;
        try {

            char[] ii=new char[-9];
            //int ii = 1 / 0;
            j = new Integer("yuh");
        } catch (Exception e) {
            System.out.println("err other nfe: " + e);
        }
        System.out.println("ok final yaa");

        System.out.println("theend " + j);

    }
}

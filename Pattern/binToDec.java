package javaScratch;

import java.util.*;

public class binToDec {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("please enter binary ");
        int binary = a.nextInt()  ;
        int decimal = 0 ;
        int pow = 0 ;

        while (binary != 0) {
            int rem = binary % 10 ;
            decimal += rem * (int)Math.pow(2,pow);
            binary = binary/10;
            pow++ ;
        }
        System.out.println(decimal);
    }
}

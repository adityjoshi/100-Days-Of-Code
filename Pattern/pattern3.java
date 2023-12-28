package javaScratch;

public class pattern3 {
    public static void main(String[] args) {
        int n = 5 ; // n tells the no of rows u want
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
}

/*
output =>
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *


 */

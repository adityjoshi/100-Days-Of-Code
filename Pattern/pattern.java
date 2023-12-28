package javaScratch;

public class pattern {
    public static void main(String[] args) {
        int n = 5 ; // n tells the no of rows u want
        for (int i = n; i >=0; i--) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
}

/*
OUTPUT = >
 *  *  *  *  *  *
 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *
 */
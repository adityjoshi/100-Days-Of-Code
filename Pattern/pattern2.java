package javaScratch;

public class pattern2 {
    public static void main(String[] args) {
        int n = 5 ; // n tells the no of rows u want
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { // here we are taking j<n so that for each row all the column should print
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
}

/*
output =>
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 */
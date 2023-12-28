package javaScratch;

public class Main {
    public static void main(String[] args) {
       for (int i = 0 ; i<9 ; i++) {
           for (int j = 0; j < 9; j++) {
               if (i%3 == 0) {
                   System.out.print((j%2==0)?'X':'O');
               } else {
                   if (j <3) {
                       System.out.print((j%2==0)?'O':'X');
                   }

               }
           }
           System.out.println();
       }


    }
}

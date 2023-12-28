package javaScratch;

public class func {
    public static void main(String[] args) {
        temp(3,4);
        System.out.println(temp(3,4));
        System.out.println(temp(4,5));
    }
    static int temp(int x , int y) {
        int area = x*y ;
        return area ;
    }
}

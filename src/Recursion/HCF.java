package Recursion;

public class HCF {
    public  static int  HCF(int x,int y ) {
        if (y == 0) {
            return x;
        }
            int small = HCF(y, x % y);
            return small;
        }
        public static int LCM(int x,int y){
        return (x/HCF(x,y)) * y;
        }

    public static void main(String[] args) {
        System.out.println(HCF(12, 16));
        System.out.println(LCM(12,16));

    }
}

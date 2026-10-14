package Recursion;

public class PowerOfNum {
    public static int power(int n,int m){
        //Base case
        if (m==0){
            return 1;
        }
        int small =power(n, m-1);
        return n*small;
    }

    public static void main(String[] args) {
        System.out.println("power = "+ power(2,5));
    }
}

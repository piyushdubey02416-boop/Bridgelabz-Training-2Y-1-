package Recursion;

public class increasingNumber {
    public static void printinc(int n){
        if(n==10){
            System.out.println(n);
            return;

        }
        System.out.println(n+" ");
        printinc(n+1);

    }

    public static void main(String[] args) {
        printinc(1);
    }
}

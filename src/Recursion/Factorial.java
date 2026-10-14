package Recursion;

public class Factorial {
    public static int fact(int n) {
        //Base case
        if (n == 0) {
            System.out.println(n);
            return 1;
        }
        System.out.println(n + " ");
        return n*fact(n-1);


    }

    public static void main(String[] args) {
        System.out.println("factorial = "+fact(5));
    }
}
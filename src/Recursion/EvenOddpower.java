
package Recursion;

public class EvenOddpower {

    public static int power(int n, int p) {
        // Base case
        if (p == 0) {
            return 1;
        }

        int half = power(n, p / 2);

        if (p % 2 == 0) {
            return half * half;
        }
        else{
            return n * half * half;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10)); // 32
    }
}

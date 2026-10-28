package Recursion;

public class printproblem {

        public static void print(String name, int index) {
            // Base case
            if (index == name.length()) {
                return;
            }
            System.out.println(name.charAt(index));

            // Recursive cal
            print(name, index + 1);
        }
        public static void main(String[] args) {
            String name = "piyush";
            print(name, 0);
        }
        public static boolean palindrome(String name, int start, int end) {

            // Base case
            if (start >= end) {
                return true;
            }

            // Compare characters
            if (name.charAt(start) != name.charAt(end)) {
                return false;
            }

            // Recursive call
            return palindrome(name, start + 1, end - 1);
        }
        public static int binarySearch(int arr[],int start, int end , int target ){
            if(start>end){
                return -1;
            }
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Search in the right half
            if (arr[mid] < target) {
                return binarySearch (arr, target, mid + 1, end);
            }
            // Search in the left half
            return binarySearch(arr, target, start, mid - 1);
        }
}
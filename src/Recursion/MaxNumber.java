package Recursion;

public class MaxNumber {
    public static int max(int arr[],int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int small = max(arr, index+1);
        return Math.max(small,arr[index]);
    }

    public static void main(String[] args) {
        int arr[] = {99,20,30,54,98};
        System.out.println(max(arr,0));
    }
}

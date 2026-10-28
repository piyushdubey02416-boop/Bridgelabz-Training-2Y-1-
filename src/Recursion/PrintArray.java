package Recursion;

public class PrintArray {
    public static void printInc(int arr[],int index){
        if (index == arr.length){
            return;
        }

        System.out.println(arr[index]);

        // Recursive call
        printInc(arr, index + 1);

    }

    public static void main(String[] args) {
        int arr[] ={10,34,2,87,34,76};
        printInc(arr,0);
    }
}

package Recursion;

public class SearchArray {
    public static int search(int arr[],int index,int target) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;

        }
        return search(arr,index+1,target );
    }
    public static void main(String[] args) {
        int arr[] = {3,5,13,7,9,2};
        int target = 9;
        System.out.println(search(arr,0,target));
    }
}

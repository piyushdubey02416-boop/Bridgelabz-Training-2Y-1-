package Classqestion;

public class mergesort {
    public static void main(String[] args) {
        int []arr=new int[]{2,4,3,6,5,9,1};
        mergesort(arr,0,arr.length);

    }
    static void mergesort(int []arr,int left,int right){
        if(left>right){
            return;
        }
        int mid=(left + right)/2;
        mergesort(arr,left,mid);
        mergesort(arr,right,mid);
    }
    int a= mid-left+1;

}

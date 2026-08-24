package Arrays.LogicBuilding;

public class MaxValue {
    public static int Max(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if (arr[i]>max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7,2,3,7,5,4};
        System.out.println(Max(arr));
    }
}

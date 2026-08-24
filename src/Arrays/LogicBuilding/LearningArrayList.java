package Arrays.LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;

public class LearningArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 3);
        list.add(1, 6);
        list.add(2, 9);
        list.add(3, 12);
        list.add(3, 100);

        System.out.println("This is our list :- " + list);
        int num[] = new int[5];
        for (int l = 0; l < num.length; l++) {
            num[l] = list.get(l);
        }
            System.out.println("we have converted arraylist into a array :-");
            System.out.println(Arrays.toString(num));


    }
}

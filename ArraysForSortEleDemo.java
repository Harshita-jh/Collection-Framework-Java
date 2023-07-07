package collectionframe;

import java.util.Arrays;

public class ArraysForSortEleDemo {
    public static void main(String[] args) {
        int arr[] = {1,20,3,40,60,5,6,7,7};
        for(int e : arr)
        System.out.print(e+",");
        Arrays.sort(arr);
        System.out.println();
        for(int e : arr)
        System.out.print(e+",");
        System.out.println(Arrays.binarySearch(arr,40));
    }
}

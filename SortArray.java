package java;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 3, 1, 6 };
        Arrays.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
package com.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void InsertionSort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (nums[j]<nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j]=temp;
                }else{
                    break;
                }
            }

        }
    }
    public static void main(String[] args) {
        int[] array = {3,1,5,2,6,9,5,6,18,32,45,21,20,14,12};
        InsertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}

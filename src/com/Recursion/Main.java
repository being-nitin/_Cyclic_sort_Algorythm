package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Cyclic sort Algorithm:
        int[] arr = {5,3,4,1,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclic(int[] nums){
        int i=0;
        while(i< nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else {
                i++;
            }
        }
    }
    public static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
/*
 we will use this method, when it will be given no's from 1 to n
 or 0 to n.
 */
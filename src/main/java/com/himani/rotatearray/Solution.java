package com.himani.rotatearray;

public class Solution {

    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static int[] rotateArray(int[] arr, int pos) {

        //If the value of positions to rotate(pos) is negative we are throwing an exception
        if(pos < 0){
            throw new IllegalArgumentException("Rotate Positions cannot be negative!");
        }

        //If the value of positions to rotate(pos) is zero -> Directly return the array
        if(pos == 0){
            return arr;
        }

        // Array Length
        int length = arr.length;

        //Creating a new array to store the rotated numbers
        int[] rotatedArray = new int[length];

        //Iterating through the array
        for(int i=0; i<length; i++){
            int curr = i+pos;                    //curr contains the new rotated position for the i th element of array
            int j = curr < length ? curr : curr%length;    //if curr is greater than array length, we will divide and get the remainder to get the correct position otherwise directly use curr
            rotatedArray[i] = arr[j];            //assigning the new rotated position
        }
        return rotatedArray;                     //return the resultant array
    }


    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public static void optimizedRotateArray(int[] arr, int pos) {
        //If the value of positions to rotate(pos) is negative we are throwing an exception
        if(pos < 0){
            throw new IllegalArgumentException("Rotate Positions cannot be negative!");
        }

        //If the value of positions to rotate(pos) is zero -> Directly return the array
        if(pos == 0){
            return;
        }

        // Array Length
        int length = arr.length;
        pos %= length;

        reverse(arr, 0, length - 1);             //Reverse the array from 0 to end of array
        reverse(arr, 0, length-pos -1);          //Reverse the array from 0 to end of array-number of positions to rotate
        reverse(arr, length-pos, length - 1);    //Reverse the array from array-number of positions to rotate to end
    }

    //Reverse Function (Reverses the array from given start index to end index)
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    //main function
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4,5,6,7};
        int rotate = 8;

        System.out.print("Actual Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i]+" ");
        }
        System.out.println();
        System.out.println("Rotate Positions : "+ rotate);

        int[] rotateArray = rotateArray(arr, rotate);

        System.out.print("Rotated Array :");
        for(int i=0; i<rotateArray.length; i++){
            System.out.print(rotateArray[i]+" ");
        }
        System.out.println();

        System.out.print("Optimized Solution: ");
        optimizedRotateArray(arr, rotate);
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i]+" ");
        }
    }
}
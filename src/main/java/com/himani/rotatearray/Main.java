package com.himani.rotatearray;

public class Main {

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
        int n = arr.length;

        //Creating a new array to store the rotated numbers
        int[] rotatedArray = new int[n];

        //Iterating through the array
        for(int i=0; i<n; i++){
            int curr = i+pos;                    //curr contains the new rotated position for the i th element of array
            int j = curr < n ? curr : curr%n;    //if curr is greater than array length, we will divide and get the
                                                 //remainder to get the correct position otherwise directly use curr
            rotatedArray[i] = arr[j];            //assigning the new rotated position
        }
        return rotatedArray;                     //return the resultant array
    }

    //main function
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4,5,6,7};
        int rotate = 2;

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
    }
}
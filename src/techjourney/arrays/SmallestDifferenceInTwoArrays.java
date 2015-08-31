package techjourney.arrays;

import java.util.Arrays;

/**
 * Problem: Java program to find the smallest difference between elements in 2 arrays
 *
 * Solution:
 *  - Sort the 2 arrays.
 *  - Assign the min difference as Integer.MAX_VALUE to a variable "diff"
 *  - Check the absolute value of difference between the first elements of both arrays. If its less than diff, assign the value to diff.
 *  - If first element of arr1 is less than first element of arr2, increment the pointer of arr1. Else, increment the pointer of arr2.
 *  - Return the variable "diff"
 */
public class SmallestDifferenceInTwoArrays {

    public static int returnSmallestDifference(int arr1[], int arr2[])
    {
        if(arr1==null || arr2 == null)
        {
            throw new NullPointerException();
        }
        if(arr1.length==0 || arr2.length==0)
        {
            return -1;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int diff = Integer.MAX_VALUE;

        int aPointer = 0;
        int bPointer = 0;

        while(aPointer < arr1.length&& bPointer <arr2.length)
        {
            if(diff > Math.abs(arr1[aPointer]-arr2[bPointer]))
            {
                diff = Math.abs(arr1[aPointer]-arr2[bPointer]);
            }

            if(arr1[aPointer]<arr2[bPointer])
            {
                aPointer++;
            }
            else
            {
                bPointer++;
            }
        }
        return diff;
    }

}

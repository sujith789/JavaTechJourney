package techjourney.arrays;

import java.util.Arrays;

/**
 * Created by Sujith Mohan on 8/10/2015.
 *
 * Problem: Given an array of ints, find out the highest product of three integers of the array
 *
 * Solution: Keep track of highest 3 integers and lowest 2 integers.
 * Highest product will be either product of highest 3 integers or highest integer and lowest 2 integers (in case of negative numbers)
 */
public class HighestProductofThreeIntegers {

    public static void main(String args[])
    {
        int arr1[] = new int[] {7,10,8,4,3,-6,-9,-2,12,4}; //Highest product = 10*8*12
        int arr2[] = new int[] {3,2,5,1,11,-10,-8,6,6,7}; //Highest product = 11*-10*-8

        System.out.println(highestProduct(arr1));
        System.out.println(highestProduct(arr2));

    }

    private static int highestProduct(int arr[])
    {
        Arrays.sort(arr);
        int len = arr.length;
        if((arr[0]*arr[1]*arr[len-1])>(arr[len-1]*arr[len-2]*arr[len-3]))
        {
            return arr[0]*arr[1]*arr[len-1];
        }
        else
        {
            return arr[len-1]*arr[len-2]*arr[len-3];
        }
    }

}

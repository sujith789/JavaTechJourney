package techjourney.arrays;

/**
 * Created by SujithMohan on 8/15/2015.
 *
 * Problem: Write a function that accepts an array of positive integers in random order of known length, but with one number missing.
 * Return the missing number.
 */
public class MissingNumber {

    public static void main(String[] args) {
        int arr[] = new int[]{4,1,6,8,12,11,2,3,10,5,9}; //Length = 12, missing number = 7
        int arr1[] = new int[]{4,1,6,8,7,11,2,3,10,5,9}; //Length = 12, missing number = 12

        findMissingNumber(arr);
        findMissingNumber(arr1);
    }

    private static void findMissingNumber(int arr[])
    {
        int length = arr.length;
        int maxNumber = arr[0];
        int sum = arr[0];

        for(int i=1;i<length;i++)
        {
            if(maxNumber<arr[i])
            {
                maxNumber = arr[i];
            }
            sum= sum+arr[i];
        }
        //If maximum number is not equal to length of array, then missing number is length of array
        if(maxNumber!=length+1)
        {
            System.out.println("Missing number = "+(length+1));
        }

        else
        {
            //Sum of first 'n' natural numbers = n*(n+1)/2
            int totalSum = ((length+1)*(length+2))/2;
            System.out.println("Missing number = "+(totalSum-sum));
        }
    }
}


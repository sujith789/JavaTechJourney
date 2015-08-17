package techjourney.arrays;

/**
 * Created by SujithMohan on 8/16/2015.
 *
 * Problem: Given an array with integers, return the contiguous sequence with maximum sum.
 * If the maximum sum is negative value, return 0.
 */
public class MaximumSumSubsequence {

    public static void main(String args[]) {
        int arr1[] = new int[]{7, 4, -13, -2, 11, 6, -5, -4, 19, 4, -12}; //Maximum sum = 31 {11+6-5-4+19+4}
        int arr2[] = new int[]{-5, -6, -7, -6, 3, -5, -9}; //Maximum sum =3;
        int arr3[] = new int[]{-4,-6,-2,-9,-8}; //Maximum sum =0;

        maximumSum(arr1);
        maximumSum(arr2);
        maximumSum(arr3);
    }

    private static void maximumSum(int arr[])
    {
    int maximumSum = 0;
    int sequenceSum = 0;

        for(Integer num:arr)
        {
            sequenceSum = sequenceSum + num;
            if(maximumSum<sequenceSum)
            {
                maximumSum = sequenceSum;
            }

            else if(sequenceSum<0)
            {
                sequenceSum = 0;
            }
        }

    System.out.println(" Maximum Sum = "+maximumSum);
    }
}

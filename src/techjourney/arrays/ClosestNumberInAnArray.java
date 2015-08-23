package techjourney.arrays;

/**
 * Created by Sujith Mohan on 8/22/2015.
 *
 * Problem: Given an array and an Integer. Return the closest number in array for that Integer.
 * for eg: Int: 7 Array: (3,8,12,5) -> 8 is the closest number
 * If 2 numbers are close to the array, return the maximum value out of those.
 * for eg: int: 7 Array: (3,8,12,6) -> 8 is the closest number
 */
public class ClosestNumberInAnArray {

    public static void main(String args[])
    {
        int arr1[] = new int[]{14,6,13,7,9,11,17,14,19};
        int num1 = 12;

        System.out.println(returnClosestNumber(arr1,num1));

        int arr2[] = new int[]{-4,-6,0,-9,-7,-9,1,3,2};
        int num2 = -8;

        System.out.println(returnClosestNumber(arr2,num2));
    }

    public static int returnClosestNumber(int arr[], int num)
    {
        if(arr == null)
        {
            throw new NullPointerException();
        }

        if(arr.length==1)
        {
            return arr[0];
        }

        else
        {
            int closestNum = arr[0];
            int dist = arr[0]-num;
            for(int i=0;i<arr.length;i++)
            {
               int diff = arr[i]-num;
                if(diff<0)
                {
                    diff = -diff;
                }
                if(diff<dist)
                {
                    dist = diff;
                    closestNum = arr[i];
                }
                //If 2 numbers are close to the array, return the maximum value out of those.
                if((diff==dist)&&(closestNum<arr[i]))
                {
                    closestNum=arr[i];
                }
            }
            return closestNum;
        }
    }
}


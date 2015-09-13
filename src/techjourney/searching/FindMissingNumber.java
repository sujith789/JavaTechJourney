package techjourney.searching;

/**
 * Created by SujithMohan on 9/12/2015.
 *
 * Given an array of elements in order and non-repeating from 1 to N. Find the missing number.
 * Eg: [1,2,3,5,6,7] - Missing number = 4
 */
public class FindMissingNumber {

    public static void main (String args[])
    {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
        System.out.println(findMissingNumber(arr,0,arr.length-1));
    }

    public static int findMissingNumber(int arr[],int first, int last) {
        //If length of array = last element of the array, it means no missing number
        if (arr.length == arr[last]) {
            return -1;
        }

        if (arr[0] != 1) {
            return 1;
        }

        while (first <= last) {

           int mid = first + (last - first) / 2;

            if (arr[mid]!=(mid + 1)) {
                if(arr[mid-1]!=(mid))
                {
                    last = mid - 1;
                }
                else
                {
                    return mid+1;
                }
            } else {

                first = mid + 1;
            }
        }
        return -1;

    }
}


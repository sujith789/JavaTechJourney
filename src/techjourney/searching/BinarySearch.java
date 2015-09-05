package techjourney.searching;

/**
 * Created by Sujith Mohan on 9/4/2015.
 * Java program to implement Binary Search
 */
public class BinarySearch {

    public static void main(String args[])
    {
        int arr[] = new int[]{1,2,2,3,6,7,12,15,16,19};
        System.out.println(binarySearch(arr,3,0,arr.length-1));

    }
    public static boolean binarySearch(int arr[], int value, int first, int last)
    {
        if (arr == null) {
            return false;
        }

        while (first <= last) {

            int index = (first + last) / 2;

            if (arr[index] == value) {
                return true;
            } else if (arr[index] > value) {
                last = index-1;
            } else {
                first = index+1;
            }
        }
        return false;
    }
}

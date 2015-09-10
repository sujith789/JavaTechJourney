package techjourney.programs;

/**
 * Created by Sujith Mohan on 9/10/2015.
 * Java program to count the number of zeros in sorted array using binary search
 */
public class CountNumberOfZeros {

    public static void main(String args[])
    {
        int arr[] = new int[]{-7,-7,-4,-2,0,0,0,0,0,1,1,1,2,3,4,4,4,6,10};
        int low = 0;
        int high = arr.length-1;
        System.out.println("Number of zeros in the array = "+countNumberOfZeros(arr, 0,high));

    }

    public static int countNumberOfZeros(int arr[],int low, int high)
    {
            int count =0;
            if (high >= low)
            {
                int mid = low + (high - low)/2;
                if (arr[mid] == 0)
                {
                    count++;
                    return count+countNumberOfZeros(arr,low,mid-1)+countNumberOfZeros(arr,mid+1,high);
                }

                else if (arr[mid]<0)
                {
                    return countNumberOfZeros(arr, (mid + 1), high);
                }

                else
                {
                    return countNumberOfZeros(arr, low, (mid -1));
                }
            }
            return count;
    }
}

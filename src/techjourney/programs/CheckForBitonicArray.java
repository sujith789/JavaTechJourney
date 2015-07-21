package techjourney.programs;

/**
 * Created by Sujith Mohan on 7/20/2015.
 * This java program is for checking whether a given array is bitonic or not.
 * A bitonic array for this program is defined as an array of length 'N' and
 * for an index 'K' in this array, where 0<K<N-1, the sequence from 0 to K should be
 * increasing order and from K to N-1 it should be in decreasing order.
 *
 * for eg: [0,2,5,9,8,6] is a bitonic array
 */
public class CheckForBitonicArray {

    public static void main(String args[])
    {
        System.out.println(checkBitonicArray(new int[]{0,1,2,3,10,9,8,7,6})); //bitonic -> true
        System.out.println(checkBitonicArray(new int[]{0,1,2,3,10,9})); //bitonic -> true
        System.out.println(checkBitonicArray(new int[]{5,4,3,2,1})); //bitonic -> true
    }

    public static Boolean checkBitonicArray(int arr[])
    {
        //minimum length for bitonic array defined in this program is 3
        if(arr.length<3)
        {
            return false;
        }
        int temp1 = arr[0];
        int temp2 = arr[1];

        if(temp1-temp2>0)
        {
            return false;
        }

        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]-temp2<0)
            {
                temp1 = i;
                temp2 = arr[i];
                break;
            }
            else
            {
                temp2 = arr[i];
            }
        }

        for(int i=temp1+1;i<arr.length;i++)
        {
            if(arr[i]-temp2>0)
            {
                return false;
            }

            else
            {
                temp2 = arr[i];
            }
        }

        return true;
    }
}

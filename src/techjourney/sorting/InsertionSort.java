package techjourney.sorting;

/**
 * Created by Sujith Mohan on 9/7/2015.
 * Java program to implement insertion sort
 *
 * Time Complexity of Bubble Sort
 * --------------------------------
 *
 * Best Case: O(n) - When array is already sorted
 * Worst Case: O(n^2)
 * Average case: O(n^2)
 */
public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = new int[]{2,5,-1,3,2,8,12,4,6,7,9,0,-7};
        System.out.println("Array before sorting:");
        printElements(arr);
        System.out.println();

        insertionSort(arr);

        System.out.println("Array after sorting:");
        printElements(arr);
    }

    public static void insertionSort(int arr[])
    {
        int temp;
        for (int i = 1; i < arr.length; i++)
        {
            for(int j = i ; j > 0 ; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

            System.out.println("After "+(i)+"(st/nd/th) iteration:");
            printElements(arr);
            System.out.println();
        }
    }

    public static void printElements(int arr[])
    {
        if((arr==null)||(arr.length==0))
        {
            System.out.println("Null or empty array");
        }

        else
        {
            for(int i:arr)
            {
                System.out.print(i+" ");
            }
        }
    }
}

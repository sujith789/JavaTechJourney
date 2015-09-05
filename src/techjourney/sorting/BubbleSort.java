package techjourney.sorting;

/**
 * Created by Sujith Mohan on 9/5/2015.
 *
 * Java program to implement bubble sort
 *
 * Time Complexity of Bubble Sort
 * --------------------------------
 *
 * Best Case: O(n) - When array is already sorted
 * Worst Case: O(n^2)
 * Average case: O(n^2)
 */

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = new int[]{2,5,-1,3,2,8,12,4,6,7,9,0,-7};
        System.out.println("Array before sorting:");
        printElements(arr);
        System.out.println();

        bubbleSort(arr);

        System.out.println("Array after sorting:");
        printElements(arr);
    }

    public static void bubbleSort(int arr[])
    {
        if(arr==null)
        {
            System.out.println("Null array. Cannot be sorted");
        }

        else
        {
            for(int i=0;i<arr.length-1;i++)
            {
                //To check whether array is sorted
                boolean flag= false;
                for(int j=0;j<arr.length-1;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        flag= true;
                    }
                }

                if(!flag)
                {
                    break;
                }

                System.out.println("After "+(i+1)+"(st/nd/rd/th) iteration:");
                printElements(arr);
                System.out.println();

            }
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


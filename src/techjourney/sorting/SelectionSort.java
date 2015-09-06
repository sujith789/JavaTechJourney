package techjourney.sorting;

/**
 * Created by Sujith Mohan on 9/5/2015.
 * Java program to implement selection sorting
 *
 * Time complexity of Selection Sort
 * ----------------------------------
 * Best Case: O(n^2)
 * Average Case: O(n^2)
 * Worst Case: O(n^2)
 */
public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = new int[]{2,5,-1,3,2,8,12,4,6,7,9,0,-7};
        System.out.println("Array before sorting:");
        printElements(arr);
        System.out.println();

        selectionSort(arr);

        System.out.println("Array after sorting:");
        printElements(arr);
    }

    public static void selectionSort(int arr[])
    {
        int iMin;
        if((arr==null)||(arr.length==0))
        {
            System.out.println("Null or empty array. Cannot be sorted");
            return;
        }

        for(int i=0;i<arr.length-1;i++)
        {
            iMin = i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[iMin])
                {
                    iMin = j;
                }
            }
            if(iMin!=i)
            {
                int temp = arr[iMin];
                arr[iMin] = arr[i];
                arr[i] = temp;
            }

            System.out.println("After "+(i+1)+"(st/nd/th) iteration:");
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


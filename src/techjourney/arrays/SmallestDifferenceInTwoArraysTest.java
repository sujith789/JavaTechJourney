package techjourney.arrays;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by SujithMohan on 8/30/2015.
 * Test class for SmallestDifferenceInTwoArrays
 */
public class SmallestDifferenceInTwoArraysTest {

    @Test(expected = NullPointerException.class)
    public void testWhenArrayIsNull() throws NullPointerException
    {
        int arr1[] = null;
        int arr2[] = new int[]{1,3,4};
        SmallestDifferenceInTwoArrays.returnSmallestDifference(arr1,arr2);
    }
    @Test
    public void testWhenLengthOfArrayIsZero()
    {
        int arr1[] = new int[]{};
        int arr2[] = new int[]{1,3,4};
        assertEquals(-1,SmallestDifferenceInTwoArrays.returnSmallestDifference(arr1,arr2));
    }

    @Test
    public void testForValidInputs()
    {
        int arr1[] = new int[]{3,4,2,9,11,15,12,16};
        int arr2[] = new int[] {19,7,19,22,23};

        assertEquals(2,SmallestDifferenceInTwoArrays.returnSmallestDifference(arr1,arr2));
    }

}
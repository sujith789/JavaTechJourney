package techjourney.bitsandbytes;

/**
 * Created by Sujith Mohan on 9/13/2015.
 * Java program to check whether a number is power of 2
 */
public class CheckForPowerOfTwo {

    public static void main(String args[])
    {
        int num1 = 25;
        System.out.println(checkNumberIsPowerOfTwo(num1));

        int num2 = 0;
        System.out.println(checkNumberIsPowerOfTwo(num2));

        int num3 = 1;
        System.out.println(checkNumberIsPowerOfTwo(num3));

        int num4 = 64;
        System.out.println(checkNumberIsPowerOfTwo(num4));

        int num5 = -16;
        System.out.println(checkNumberIsPowerOfTwo(num5));

    }

    public static boolean checkNumberIsPowerOfTwo(int num)
    {
        if(num==0)
        {
            return false;
        }
        return ((num&(num-1))==0);
    }
}

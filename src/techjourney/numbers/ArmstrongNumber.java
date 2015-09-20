package techjourney.numbers;

/**
 * Created by Sujith Mohan on 9/19/2015.
 * Java program to check a given number is armstrong number.
 * An armstrong number is a number where sum of each digits raised to the power of number of digits is equal to the number itelf.
 * Eg: 0,1,2,3...9,153,370,371,1634..
 * 153 = 1^3 + 5^3 +3^3 = 1 +125+27
 */
public class ArmstrongNumber {
    public static void main(String args[])
    {
        System.out.println(isArmstrongNumber(153));//true
        System.out.println(isArmstrongNumber(55));//false
        System.out.println(isArmstrongNumber(1634));//true
        System.out.println(isArmstrongNumber(3));//true
        System.out.println(isArmstrongNumber(1760));//false
        System.out.println(isArmstrongNumber(371));//true
    }

    public static boolean isArmstrongNumber(int num)
    {
        int digits = numberOfDigits(num);
        int vNum = num;
        int sum = 0;
        while(num>0)
        {
            int val = num%10;
            sum += (int)Math.pow(val,digits);
            num = num/10;
        }
       if(sum==vNum)
       {
           return true;
       }
        return false;
    }

    public static int numberOfDigits(int num)
    {
        int noOfDigits = 0;
        while(num>0)
        {
            num=num/10;
            noOfDigits++;
        }
        return noOfDigits;
    }
}

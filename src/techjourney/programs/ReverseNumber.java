package techjourney.programs;

/**
 * Created by Sujith Mohan on 9/13/2015.
 * Java program to reverse a number
 */
public class ReverseNumber {

    public static void main(String args[])
    {
        int num1 = 76398123;
        reverseANumber(num1);

        int num2 = 0;
        reverseANumber(num2);

        int num3 = 5;
        reverseANumber(num3);

        int num4 = -9187632;
        reverseANumber(num4);

        int num5 = 2700000;
        reverseANumber(num5);
    }

    public static void reverseANumber(int num)
    {
        boolean isNegative = false;
        int reverse = 0;
        int vNum = num;

        //Checking whether number is negative
        if(num<0)
        {
            isNegative = true;
            num = -num;
        }

        if(num%10==num)
        {
            reverse = num;
        }

        else
        {
            while(num!=0)
            {
                reverse = reverse*10 +num%10;
                num = num/10;
            }

        }

        if(isNegative)
        {
            reverse = -reverse;
        }

        System.out.println("Reverse of number "+vNum+" is: "+reverse);
    }
}

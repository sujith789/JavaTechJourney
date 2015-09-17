package techjourney.numbers;

/**
 * Created by Sujith Mohan on 9/17/2015.
 * Java program to check if a given number is prime or not
 */
public class PrimeNumber {

    public static void main(String args[])
    {
        System.out.println(checkPrimeNumber(233));

        System.out.println(checkPrimeNumber(79));

        System.out.println(checkPrimeNumber(100));

        System.out.println(checkPrimeNumber(21));

        System.out.println(checkPrimeNumber(23));
    }

    public static boolean checkPrimeNumber(int num)
    {
        if(num<2)
        {
            return false;
        }

        else if(num==2)
        {
            return true;
        }
        else
        {
            for(int i=3;i<=num/2;i=i+2)
            {
                if(num%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}

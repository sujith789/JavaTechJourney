package techjourney.numbers;

/**
 * Created by Sujith Mohan on 9/16/2015.
 * Java program to check whether the given number is Fibonacci or not.
 * A number 'n' is Fibonacci if (5*(n^2)+4) or (5*(n^2)-4) is a perfect square
 */
public class FibonacciNumber {

    public static void main(String args[])
    {
        int num1 = 34;
        System.out.println(checkFibonacciNumber(num1));

        int num2 = 55;
        System.out.println(checkFibonacciNumber(num2));

        int num3 = 20;
        System.out.println(checkFibonacciNumber(num3));

    }

    public static boolean checkFibonacciNumber(int n)
    {
        return((checkPerfectSquare((5*(n*n))+4))||(checkPerfectSquare((5*(n*n))- 4)));
    }

    public static boolean checkPerfectSquare(int num)
    {
        if(num ==1)
        {
            return true;
        }
        else
        {
            int val = 2;
            int square = val*val;
            while(square<=num)
            {
                if(square==num)
                {
                    return true;
                }
                else
                {
                    val++;
                    square=val*val;
                }
            }
            return false;
        }
    }
}

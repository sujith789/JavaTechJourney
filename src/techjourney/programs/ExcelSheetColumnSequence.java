package techjourney.programs;

/**
 * Created by Sujith Mohan on 10/4/2015.
 *
 * Java program to generate Excel Sheet Column Sequence
 *
 * Problem: Given a number 'N', the program should print in the order of Excel Sheet Column Sequence upto that number
 * i.e in the order A,B,C...Z,AA,AB,..AZ,..ZA...ZZ,AAA,AAB,...ZZZ
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class ExcelSheetColumnSequence {
    public static void main(String args[])
    {
        System.out.println(" Excel Sheet Column Sequence");
        int num=100;
        Set<String> sequence = new LinkedHashSet<String>();
        sequence = generateValue(num);
        System.out.println();
        for(String item: sequence)
        {
            System.out.print(item + "  ");
        }
    }

    public static Set<String> generateValue(int num)
    {
        Set<String> sequence = new LinkedHashSet<String>();
        char temp='A';
        char temp1 = 'Z';
        int tempnum;
        for(int i=1;i<=num;i++)
        {
            tempnum=i;
            String returnval="";
            while(tempnum>0)
            {
                int val=tempnum%26;

                if(val==0)
                {
                    char append=(char) (val+ temp1);
                    returnval=append + returnval;
                    tempnum=(tempnum/26) -1;
                }
                else
                {
                    char append=(char) (val-1 +temp);
                    returnval= append + returnval;
                    tempnum=tempnum/26;
                }

            }
            sequence.add(returnval);
        }
        System.out.println();
        return sequence;
    }
}
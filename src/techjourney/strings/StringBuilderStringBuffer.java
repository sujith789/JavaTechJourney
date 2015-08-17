package techjourney.strings;

import java.util.Date;

/**
 * Created by SujithMohan on 8/16/2015.
 * Java program to compare the performance of StringBuffer and StringBuilder
 */
public class StringBuilderStringBuffer {

    public static long StringBufferTest()
    {
        Date startDate = new Date();
        StringBuffer sBuffer = new StringBuffer();

        for(int i=0;i<50000;i++)
        {
            sBuffer.append("s");
        }
        Date endDate = new Date();
        long ms = endDate.getTime()-startDate.getTime();
        System.out.println(" StringBuffer time in ms: " +ms);
        return ms;
    }

    public static long StringBuilderTest()
    {
        Date startDate = new Date();
        StringBuilder sBuilder = new StringBuilder();

        for(int i=0;i<50000;i++)
        {
            sBuilder.append("s");
        }
        Date endDate = new Date();
        long ms = endDate.getTime()-startDate.getTime();
        System.out.println(" StringBuilder time in ms: " +ms);
        return ms;
    }

    public static void main(String[] args) {

        long totalStringBuilderTest = 0;
        long totalStringBufferTest = 0;

        for (int i=0; i<10;i++)
        {
            totalStringBufferTest += StringBufferTest();
            totalStringBuilderTest += StringBuilderTest();
        }

        System.out.println("Total time taken for String Buffer Test = "+totalStringBufferTest);
        System.out.println("Total time taken for String Builder Test = "+totalStringBuilderTest);
    }
}


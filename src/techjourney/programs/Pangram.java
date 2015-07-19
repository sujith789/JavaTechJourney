package techjourney.programs;

/**
 * Created by SujithMohan on 7/19/2015.
 * Java Program to check a given string is palindrome
 */
public class Pangram {

    public static Boolean checkForPangram(String str)
    {
        int len = str.length();
        //test string for testing all characters are present in the given string
        String testString = "abcdefghijklmnopqrstuvwxyz";

        for (int i=0;i<len;i++)
        {
            char chars =str.charAt(i);
            //Converting the char to String and to match with the 'testString'
            String word =Character.toString(chars).toLowerCase();
            testString = testString.replaceAll(word, "");

            if(testString.equals(""))
            {
                return true;
            }
        }
        return false;
    }
}
package techjourney.strings;

/**
 * Created by Sujith Mohan on 9/9/2015.
 * Java program to reverse a string using recursion
 */
public class ReverseStringUsingRecursion {

    public static  void main(String args[])
    {
        String str = "Java Tech Journey";
        System.out.println("Reverse of the string = " + reverseStringUsingRecursion(str));
    }

    public static String reverseStringUsingRecursion(String str)
    {
        if(str==null)
        {
            return null;
        }

        if((str.isEmpty())||(str.length()==1))
        {
            return str;
        }

        StringBuilder newString = new StringBuilder();

        //Appending the last character of the string
        newString.append(str.charAt(str.length()-1));
        //Calling recursive function for the remainder of the string
        newString.append(reverseStringUsingRecursion(str.substring(0,str.length()-1)));

        return newString.toString();
    }
}


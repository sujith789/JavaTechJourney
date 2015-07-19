package techjourney.programs;

/*
 * Java program to convert mobile number pad to characters.
 */
import java.util.HashMap;

public class MobilePhoneNumPadToCharacters {

    public static void main(String[] args) {

        System.out.println(returnWords("222#2#8")); //CAT
        System.out.println(returnWords("5555#2#888888#2222"));  //JAVA
    }


    public static String returnWords(String str)
    {
        HashMap<Character, String> mobileNumPad = new HashMap<Character, String>();

        mobileNumPad.put('2', "ABC");
        mobileNumPad.put('3', "DEF");
        mobileNumPad.put('4', "GHI");
        mobileNumPad.put('5', "JKL");
        mobileNumPad.put('6', "MNO");
        mobileNumPad.put('7', "PQRS");
        mobileNumPad.put('8', "TUV");
        mobileNumPad.put('9', "WXYZ");
        mobileNumPad.put('0'," ");

        String[] tokens = str.split("#");
        String out = "";

        for (int i = 0; i < tokens.length; i++)
        {
            char temp = tokens[i].charAt(0);
            String getWords = mobileNumPad.get(temp);
            int length = tokens[i].length();

            if(length>getWords.length())
            {
                length = length%getWords.length();
            }

            if(length == 0)
            {
                length = getWords.length();
            }
            out = out+getWords.charAt(length-1);

        }

        return out;
    }
}


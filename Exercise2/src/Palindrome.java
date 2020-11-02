import java.util.Scanner;

public class Palindrome {

    public static String word;

        public static void main (String[]args) {
            Scanner in = new Scanner( System.in );

            System.out.println( "Enter a Palindrome word" );
            word = in.nextLine();
            String reverse = "";
            char[] letters = word.toCharArray();
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt( i );
                //System.out.println(reverse);
            }

            if (word.equals( reverse ))
                System.out.println(word+  " is a Palindrome" );
            else
                System.out.println( word + " is not a Palindrome word/s" );
        }
}

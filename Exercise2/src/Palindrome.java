import java.util.Scanner;

public class Palindrome {

    public static String word;

    public static void palindrome() {
        Scanner in = new Scanner( System.in );
        while (true) {
            System.out.println( "Enter a Palindrome word" );
            String newWord = in.nextLine();
            word = newWord.trim();

            if (word.equals("0"))
                Menu.main(null);

            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt( i );
            }

            if (word.equals( reverse ))
                System.out.println( word + " is a Palindrome" );
            else
                System.out.println( word + " is not a Palindrome word/s" );

            System.out.print("Enter 0 to return to Menu or ");
        }
    }
}


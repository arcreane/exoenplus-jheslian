import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner in =new Scanner( System.in );

        System.out.println("Menu: Choose a game");
        System.out.println("1 Guess a number");
        System.out.println("2 Palindrome");
        System.out.println("3 Number Identical");
        System.out.println("4 Minesweeper");
        System.out.println("5 Quit");
        int input= in.nextInt();

        if (input==1)
            GuessANumber.guessANumber();
        else if (input==2)
            Palindrome.palindrome();
        else if (input==3)
            UserInputArrays.identicalNumbers();
        else if (input==4)
            Minesweeper.mine();
        else if (input==5)
            System.exit( 0 );
    }
}

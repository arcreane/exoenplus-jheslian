import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner in= new Scanner( System.in );

        Random random = new Random();
        int cpuPlayer = random.nextInt( 100 ) + 1;
        System.out.println( cpuPlayer );
        System.out.println( "Guess the number generated by computer , you have 10 guess:" );

        int count=0;
        while(count<10) {
            int input = in.nextInt();

            if (cpuPlayer == input)
                System.out.println( "Perfect, you have guess the number" );
            else if (cpuPlayer>input)
                System.out.println("Wrong, the number is higher");
            else if (cpuPlayer<input)
                System.out.println("Wrong, the number is lower");

        count++;
            System.out.println("You used " + count + " guess");
        }System.out.println("And you lose, the number is "+ cpuPlayer);
    }
}
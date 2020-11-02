import java.util.Scanner;

public class Minesweeper {
    public static int height, width, nbOfBombs;
    public static void mine() {
        Scanner in = new Scanner( System.in );
        System.out.println("Enter height for your mine");
        height = in.nextInt();
        System.out.println("Enter desire width for your mine");
        width = in.nextInt();
        System.out.println("How many bombs would you like to start");
        nbOfBombs = in.nextInt();


    }
}

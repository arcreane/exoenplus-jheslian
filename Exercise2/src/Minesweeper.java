import java.util.Scanner;
import java.util.Random;

public class Minesweeper {
    public static int height, width, nbOfBombs;
    public static int[][]tab= new int [height][width];
    public static void mine() {

        Scanner in = new Scanner( System.in );
        System.out.println("Enter height for your mine");
        height = in.nextInt();
        System.out.println("Enter desire width for your mine");
        width = in.nextInt();
        System.out.println("How many bombs would you like to start");
        nbOfBombs = in.nextInt();

        int[][]tab= new int [height][width];
        int[] surrogates = {0xD83D, 0xDC7D};
        String alienEmojiString = new String(surrogates, 0, surrogates.length);
        System.out.println(alienEmojiString);
        for (int i = 0; i < tab.length; i++) {
            System.out.println();
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(Character.toChars(0x22770));
            }
        }

        Random random =new Random();
    }
}

import java.util.Scanner;
public class UserInputArrays {
    public static int i, j, k;
    public static void identicalNumbers() {
        int [][] array= new int[3][5];
        boolean error=false;
        boolean duplicate=false;
        Scanner in = new Scanner( System.in );
        for (i = 0; i < array.length; i++) {
            System.out.println("enter 5 numbers. Warning! number must be distinct and only from 1 to 10");
            if (error){
                i--;
                error=false;}
            for (j = 0; j < array[i].length; j++) {
                array[i][j]=in.nextInt();

                for (k=0;k<j;k++) {
                    if (array[i][j] == array[i][k]){
                        System.out.println( "Warning the array should not contain duplicate number" );
                        if (i == 0)
                            error = true;
                        else
                            i--;
                        k=4;
                        j = 4;
                    }
                }


                if (0 > array[i][j] || 10<array[i][j]) {
                    System.out.println( "Warning the array should contain a number from 0 to 10" );
                    if (i == 0)
                        error=true;
                    else
                        i--;
                    j=6;
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                if (array[0][i]==array[1][j]){
                    for (int k = 0; k < array[2].length; k++) {
                        if (array[0][i]==array[2][k]) {
                            System.out.println();
                            System.out.println("Duplicate Number " +array[0][i]+ " at indexes");
                            System.out.println("------> index " +i+ " of array 1");
                            System.out.println("------> index " +j+ " of array 2");
                            System.out.println("------> index " +k+ " of array 3\n");
                        }
                        duplicate=true;
                    }
                }
            }
        }
        System.out.println();
        if (!duplicate)
            System.out.println("There's no identical numbers on your 3 arrays");

        System.out.println("Enter 0 to go back to menu");
        int exit = in.nextInt();
            if (exit==0)
                Menu.main(null);
    }
}

import java.util.Scanner;

public class QuartsToGallonsInteractive
{
    public static void main(String [] args)
    {
        int numberOfQuartsInputed;
        final int NUM_QUARTS_IN_GALLON= 4;
        int remainderOfQuoets;
        int numberOfGallons;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Please enter the number of quorts needeed to do this job>>>");
        numberOfQuartsInputed =keyboard.nextInt();

        numberOfGallons= numberOfQuartsInputed / NUM_QUARTS_IN_GALLON;
        remainderOfQuoets= numberOfQuartsInputed % NUM_QUARTS_IN_GALLON;
        System.out.println("The number of gallons ordered is " + numberOfGallons + " and the number of quarts remaining is4 " + remainderOfQuoets);
    }
}

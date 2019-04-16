import java.util.Scanner;

public class Eggs {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        double numberOfDozenEggs;
        double numberOfIndividualEggs;
        double TOTAL_COST_FOR_EGGS;
        double TOTAL_COST_FOR_DOZEN_EGGS;
        double TOTAl_COST_FOR_SINGLE_EGG;

        System.out.println("how many dozens of eggs");
        numberOfDozenEggs=keyboard.nextDouble();

        System.out.println("how many single eggs");
        numberOfIndividualEggs=keyboard.nextDouble();
        TOTAL_COST_FOR_DOZEN_EGGS=3.25* numberOfDozenEggs;
        TOTAl_COST_FOR_SINGLE_EGG=.45 *numberOfIndividualEggs;

        TOTAL_COST_FOR_EGGS= TOTAL_COST_FOR_DOZEN_EGGS+TOTAl_COST_FOR_SINGLE_EGG;

        System.out.println("The Total is " + TOTAL_COST_FOR_EGGS+ ", in " + TOTAL_COST_FOR_DOZEN_EGGS + " Dozen and \n" +
                " "+ numberOfIndividualEggs+ " eggs.");




    }
}

import java.util.Scanner;

public class Eggs {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        double numberOfDozenEggs;
        double numberOfIndividualEggs;
        double TOTAL_COST_FOR_EGGS;
        double TOTAL_COST_FOR_DOZEN_EGGS=3.25;
        double TOTAl_COST_FOR_SINGLE_EGG=.45;

        System.out.println("how many dozens of eggs");
        numberOfDozenEggs=keyboard.nextDouble();

        System.out.println("how many single eggs");
        numberOfIndividualEggs=keyboard.nextDouble();

        TOTAL_COST_FOR_EGGS= TOTAL_COST_FOR_DOZEN_EGGS+TOTAl_COST_FOR_SINGLE_EGG;
        TOTAl_COST_FOR_SINGLE_EGG=numberOfIndividualEggs*TOTAl_COST_FOR_SINGLE_EGG;
        TOTAL_COST_FOR_DOZEN_EGGS=numberOfDozenEggs*TOTAL_COST_FOR_DOZEN_EGGS;
        System.out.println("The cost for "+ numberOfDozenEggs+"Dozen is "+ TOTAL_COST_FOR_DOZEN_EGGS+", the cost for " +
                ", the cost for" +);





    }
}

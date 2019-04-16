import java.util.Scanner;

public class InchesToFeet {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        double NUMBER_OF_FEET;
        double numberOfInches;
        System.out.println("Enter number of inches");
        numberOfInches=keyboard.nextDouble();

        NUMBER_OF_FEET= numberOfInches / 12;
        System.out.println("There are "+NUMBER_OF_FEET +"feet in "+ numberOfInches);



    }
}

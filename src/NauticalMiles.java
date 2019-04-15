import java.util.Scanner;

public class NauticalMiles {
    public static void main(String [] args){

        double numberOfNauticalmiles ;
        final double NUM_OF_NAUTICAL_MILES= 1.150779;
        double numberOfKilometers;
        final double NUM_OF_KILOMETERS ;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Please enter nautical miles>>>");
        numberOfNauticalmiles =keyboard.nextDouble();

        NUM_OF_KILOMETERS = numberOfNauticalmiles / NUM_OF_NAUTICAL_MILES;
        numberOfKilometers= numberOfNauticalmiles % NUM_OF_NAUTICAL_MILES;
        System.out.println("The number of nautical mile " + NUM_OF_KILOMETERS + " and number of kilometers " + numberOfKilometers);
    }
}

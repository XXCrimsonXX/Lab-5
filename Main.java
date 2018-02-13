import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int mpgRating;
        double tankCapacity;
        double tankFilled;

        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        mpgRating = scnr.nextInt();

        if (mpgRating <= 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            System.exit(0);

        }

        System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
        tankCapacity = scnr.nextDouble();

        if (tankCapacity <= 0.0) {
            System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            System.exit(0);
        }

        System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        tankFilled = scnr.nextDouble();

        if (tankFilled < 0.0 || tankFilled > 100.0) {
            System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            System.exit(0);
        }

        double rawRange = mpgRating * tankCapacity * (tankFilled * 0.01);
        int range = (int) rawRange;

        if (range <= 25) {
            System.out.print("Attention! Your current estimated range is running low: " + range +  " miles left!!!");

        }
        else {
            System.out.print("Keep driving! Your current estimated range is: " + range + " miles!");
        }


    }
}

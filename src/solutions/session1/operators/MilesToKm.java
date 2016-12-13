package solutions.session1.operators;

public class MilesToKm {

    /*
    * Distance between Florence to Milan is 308km. How many miles is 308kms?
    * Write a program to convert miles to kilometers and print it.
    * 1mile = .1.6km.
    * The result should be something like "xxx Miles".
    * */
    public static void main(String[] args) {

        int distanceCoveredKMs = 308;

        double conversionRatio = 1.6;
        
        double distanceCoveredMiles = distanceCoveredKMs / conversionRatio;

        System.out.println(distanceCoveredMiles + " Miles");
    }
}

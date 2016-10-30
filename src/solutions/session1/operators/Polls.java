package solutions.session1.operators;

/**
 * User: junaid
 * Date: 30/10/2016
 */
public class Polls {

    public static void main(String[] args){
        /*Calculate probability of Clinton winning*/

        double votersFavouringTrump = 2000;

        double votersFavouringClinton = 3000;

        /*Calculate percentage of voters favouring Clinton*/

        double percentageVotersFavouringClinton = 100* (votersFavouringClinton / (votersFavouringClinton + votersFavouringTrump));

        System.out.println(percentageVotersFavouringClinton + "%");
    }
}

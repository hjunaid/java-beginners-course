package solutions.session2.data_structures;

import java.util.ArrayList;
import java.util.List;

/**
 * User: junaid
 * Date: 30/10/2016
 */
public class Wines {

    /**
     * Create a class to represent a wine by name.
     * Add Champaigne, Port and   into an Array
     * Loop through the array and print name of each wine
     */

    public static void main(String[] args) {
        List<Wine> wines = new ArrayList<>();
        wines.add(new Wine("Champaigne"));
        wines.add(new Wine("Port"));
        wines.add(new Wine(",,"));

        for (Wine wine : wines) {
            System.out.println(wine);
        }
    }
}

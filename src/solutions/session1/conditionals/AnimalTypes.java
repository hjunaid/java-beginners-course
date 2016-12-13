package solutions.session1.conditionals;

/**
 * User: junaid
 * Date: 30/10/2016
 */
public class AnimalTypes {

    /*
    *  You can tell age of a kitten by examinings its eyes.
    *  If its eyes are closed, it must be less than 14 days old.
    *  If its eyes has started to change color then it must be 6-7 weeks old.
    *  Write a program to determine age of a kitten.
    */
    public static void main(String[] args) {
        String eyes = "shut";

        //hint: Use equals() methods on String variable to compare eyes.

        if (eyes.equals("shut")) {
            System.out.println("This kitten is less than 15 days old.");
        } else if (eyes.equals("changingColor")) {
            System.out.println("This kitten is between 6-7 weeks old.");
        } else {
            System.out.println("This kitten is older than 6 weeks");
        }
    }
}

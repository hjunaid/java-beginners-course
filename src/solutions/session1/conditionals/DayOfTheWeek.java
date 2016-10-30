package solutions.session1.conditionals;

/**
 * User: junaid
 * Date: 30/10/2016
 */
public class DayOfTheWeek {
    /*
    *  Write a program to tell which day of the week it is. Display an appropriate message for specific day.
    * */
    public static void main(String[] args) {
        String dayOfTheWeek = "Tuesday";

        /*Program should pring day of the week and a message appropriate for the day*/
        switch (dayOfTheWeek) {
            case "Monday":
                System.out.printf("It is Monday, again.");
                break;
            case "Tuesday":
                System.out.printf("It is Tuesday, lets get stuff done.");
                break;
            case "Wednesday":
                System.out.printf("It is Wednesday, the hump day.");
                break;
            case "Thursday":
                System.out.printf("It is Thursday, i can smell the weekend.");
                break;
            case "Friday":
                System.out.printf("It is Friday!!.");
                break;
            case "Saturday":
                System.out.printf("It is Saturday, party time!");
                break;
            case "Sunday":
                System.out.printf("It is lovely Sunday today.");
                break;
            default:
                System.out.printf("Incorrect day of the week entered. Please try again.");
                break;

        }
    }
}

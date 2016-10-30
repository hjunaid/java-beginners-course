package solutions.session1.homework;

/**
 * User: junaid
 * Date: 30/10/2016
 */
public class Calculator {

    /*
    * Write a program to calculate addition, substraction, multiplication and division of two variables.
    * */
    public static void main(String[] args) {
        double firstVariable = 2.0;
        double secondVariable = 4.0;
        String operation = "+";
        double result = 0.0;

        /*
        * Use a switch statement to decide which operator to apply for two variables.
        * */
        switch (operation) {
            case "+":
                result = firstVariable + secondVariable;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = firstVariable * secondVariable;
                System.out.println("Result: " + result);
                break;
            case "/":
                result = firstVariable / secondVariable;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = firstVariable - secondVariable;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.printf("Please enter +,-,/,* for operation value.");
                break;
        }

    }
}

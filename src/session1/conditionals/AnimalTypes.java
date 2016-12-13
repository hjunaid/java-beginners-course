package session1.conditionals;

/**
 * User: junaid
 * Date: 30/10/2016
 */
public class AnimalTypes {

    /*
    * You can guess animal type by number of legs. Write a programs to print messages based on 
    * number of legs. 
    */
    public static void main(String[] args){
        int numberOfLegs = 2;

        //hint: Use if-else block to compare numberOfLegs and then print a message.
        if(numberOfLegs == 2){
        	System.out.println("You are a monkey.");
        }else if (numberOfLegs == 4){
        	System.out.println("You are a donkey.");
        }else{
        	System.out.println("You are an alien.");
        }
    }
}

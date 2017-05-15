/**
 * Created by michaelfestger on 5/10/17.
 */
package io;
        import java.util.Scanner;
        import java.util.Random;

public class StringExercise {
    public static void main(String[] args) {

        //Exercise 1
        String message;
        message = "We Don't Need No Education";
        System.out.println(message);

        message = "We Don't Need No Thought Control";
        System.out.println(message);

        //Exercise 2
        message = "Check \"this\" out";
        System.out.println(message);

        //Exercise 3 & 4
        message = "I can do backslashes \\,  here are double \\\\";
        System.out.println(message);

        //Bonus Exercise
        Scanner input = new Scanner(System.in);
        System.out.println("Talk to Bob:");
        String bob = input.nextLine();

        if(bob.endsWith("?")){
            System.out.println("Sure.");
        } else if(bob.trim().isEmpty()){
            System.out.println("Fine. Be that way...");
        } else if(bob.endsWith("?") || bob.toUpperCase().equals(bob)){
            System.out.println("Whoa, chill out!");
        } else {
            System.out.println("Whatever.");
        }


    }
}

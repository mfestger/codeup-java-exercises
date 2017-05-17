
/**
 * Created by michaelfestger on 5/11/17.
 */

package io;

import java.util.Scanner;
import java.util.Random;

public class MethodsExercise {

    String[] itemHolder;
    double[] priceHolder;
    int[] numberofItemsArray;
    Scanner input = new Scanner(System.in);

    public static int subtraction(int number, int number2) {
        return number - number2;
    }

    public static int multiplication(int number, int number2) {
        return number * number2;
    }

    public static int division(int number, int number2) {
        return number / number2;
        // attempting to divide by 0 will crash
    }

    public static int modular(int number, int number2) {
        return number % number2;
    }

    public static int multiplyHardMode(int number, int number2) {
        int var = 0;
        for (int i = 1; i <= number2; i++) {
        }
        return var += number;
    }

    public static void getInteger() {
        System.out.print("Enter a number between 1 and 10: ");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        System.out.println("HINT: It is: " + randomNumber);
        int userInput = scan.nextInt();


        if (userInput > 10 || userInput < 1) {
            System.out.println("That was not a valid number.");
            getInteger();
        }

        if (randomNumber == userInput) {
            System.out.println("Correct!");
            System.out.print("The correct number is: " + randomNumber);
        } else {
            System.out.println("Nope.");
            getInteger();
        }

    }

    public class Factorial {
        public void main(String[] args) {
            // input is a number (integer)
            // factorial is the output (Integer -> long)
            long number = 7;
            long factorial;
            Scanner input = new Scanner(System.in);
            // there is going to be a series of transformations
            // constant  -> variable
            // variable -> if statement
            // if -> loop
            String wantsToContinue;
            do {


                System.out.println("Please enter an integer.");
                number = input.nextLong();
                factorial = 1;
                for (int i = 1; i <= number; i++) { //counter
                    factorial = factorial * i; //accumulator
                }
                System.out.println(number + "! = " + factorial);

                System.out.println("Do you want to continue? (y/n)?");
                input.nextLine();
                wantsToContinue = input.nextLine();

            } while ("y".equalsIgnoreCase(wantsToContinue));
        }
    }

}
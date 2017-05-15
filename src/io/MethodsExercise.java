
/**
 * Created by michaelfestger on 5/11/17.
 */

package io;

import java.util.Scanner;
import java.util.Random;

public class MethodsExercise {
    public static void main(String[] args) {


        System.out.println("5 + 5 = " + addition(5, 5));
        System.out.println("10 - 5 = " + subtraction(10, 5));
        System.out.println("5 * 2 = " + multiplication(5, 5));
        System.out.println("10 / 2 = " + division(10, 2));
        System.out.println("50 % 3 = " + modular(50, 3));
        System.out.println("5 * 5 = " + multiplyHardMode(5, 5) + " This was done without the multiplication operator");
        getInteger();


    }

    public static int addition(int number, int number2) {
        return number + number2;
    }

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
//            return randomNumber;
        } else {
            System.out.println("Nope.");
            getInteger();
        }

    }




}
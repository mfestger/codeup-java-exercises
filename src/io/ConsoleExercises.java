package io;

import java.util.Scanner;
/**
 * Created by michaelfestger on 5/8/17.
 */
public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // This prompts the user to enter an integer and upon entry, returns the value in the console.
        System.out.println("Please enter an integer:");
        int enterInt = scan.nextInt();
        System.out.println(enterInt);

        // This prompts the user to enter three strings, then returns the value in the console.
        System.out.println("Please enter your first, middle, and last name:");
        String firstName = scan.next();
        String middleName = scan.next();
        String lastName = scan.nextLine();
        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);

        // This will capture all of the input data and return it, regardless of number of words.
        System.out.println("Feel free to type out a sentence with a length of your choosing.");
        String sentenceVariable = scan.nextLine();
        System.out.println(sentenceVariable);

        // This generates the area and perimeter of the room by using simple arithmetic
        System.out.println("Please enter the width of the classroom, in feet:");
        double width = scan.nextDouble();
        System.out.println("Please enter the length of the classroom, in feet:");
        double length = scan.nextDouble();
        System.out.println("Please enter the height of the classroom, in feet:");
        double height = scan.nextDouble();
        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        double volume = height * length * width;
        System.out.println("Area: " + area + " = " + length + " x " + width);
        System.out.println("Perimeter: " + perimeter + " = " + " 2 x " + length + " + " + "2 x " + width);
        System.out.println("Volume: " + volume + " = " + length + " x " + width + " x " + height);

    }
}

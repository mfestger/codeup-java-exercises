/**
 * Created by michaelfestger on 5/9/17.
 */
package io;

import java.util.Scanner;
import java.util.Random;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Exercise 1.1 "While"
        int i = 5;
        while(i <= 15){
            System.out.println(i);
            i++;
        }

        //Exercise 1.2 "Do While"
        int z = 2;
        do {
            System.out.println(z);
            z += 2;
        } while (z <= 100);

        int a = 100;
        do {
            System.out.println(a);
            a -= 5;
        } while (a >= -10);

        long b = 2;
        do {
            System.out.println(b);
            b *= b;
        } while (b <= 1000000);




        // Exercise 2 "FizzBuzz"
        int p = 1;
        System.out.println("FizzBuzz Exercise");
        while (p <= 100) {

            if (p % 3 == 0 & p % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (p % 5 == 0) {
                System.out.println("Buzz");
            } else if (p % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(p);
            }
            p++;
        }


        //Exercise 3
        System.out.println("What number would you like to go up to? (Integers only)");

        int enterInt = scan.nextInt();
        System.out.println(enterInt);
        int x = 1;
        System.out.print("number");
        System.out.print(" | ");
        System.out.print("squared");
        System.out.print(" | ");
        System.out.print("cubed");
        System.out.println(" ");
        while (x <= enterInt) {
            int squared = x * x;
            int cubed = x * x * x;
            System.out.println("   " + x + "        " + squared + "       " + cubed);
            x++;

        }

        //Exercise 4
        System.out.println("Please enter a numerical grade from 0 - 100.");
        int grade = scan.nextInt();

       if (grade <= 60){
           System.out.println("F");
       } else if (grade >= 61 & grade <= 66) {
           System.out.println("D");
       } else if (grade >= 67 & grade <= 79){
           System.out.println("C");
       } else if (grade >= 80 & grade <= 89){
           System.out.println("B");
       } else if (grade >= 90){
           System.out.println("A");
       }

       // BONUS EXERCISES


        //Bonus 1

        System.out.println("Type in an integer to hear the raindrops. Type 'Stop' to terminate. ");
        int myNumber = scan.nextInt();

        if(myNumber % 3 != 0 & myNumber % 5 != 0 & myNumber % 7 != 0){
            System.out.println(myNumber);
        }
        if (myNumber % 5 == 0){
            System.out.print("Plang");
        }
        if (myNumber % 7 == 0){
            System.out.print("Plong");
        }
        if (myNumber % 3 == 0){
            System.out.print("Pling");
        }

       // Bonus 2
        int students = 1;
        int[] classroom;
        classroom = new int[11];

        while (students <= 10) {
            Random rand = new Random();
            int score = rand.nextInt(100) + 1;
            classroom[students] = score;
            System.out.println("Student " + students + ": " + classroom[students]);
            students++;
        }
        int average = (classroom[1] + classroom[2] + classroom[3] + classroom[4] + classroom[5] + classroom[6] + classroom[7] + classroom[8] + classroom[9] + classroom[10]) / 10;
        int min = classroom[1];
        for (int t = 1; t <= classroom.length - 1; t++){
            if (min > classroom[t]){
                min = classroom[t];
            }
        }
        System.out.println("Class Average: " + average);
        System.out.println("Lowest Score: " + min);









    }
}






/**
 * Created by michaelfestger on 5/9/17.
 */
package io;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;

//        System.out.println("FizzBuzz Exercise");
//        while(i <= 100){
//            System.out.println(i);
//            i++;
//            if (i % 3 == 0){
//                System.out.println("fizz");
//            } else if (i % 5 == 0){
//                System.out.println("buzz");
//            }  if (i % 3 == 0 & i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }
//        }

        System.out.println("What number would you like to go up to? (Integers only)");

        int enterInt = scan.nextInt();
        System.out.println(enterInt);
        int x = 1;
        System.out.println("number");
        while(x <= enterInt){
            System.out.println(x);
            x++;
        }



    }
}
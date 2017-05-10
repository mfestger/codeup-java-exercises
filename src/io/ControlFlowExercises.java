/**
 * Created by michaelfestger on 5/9/17.
 */
package io;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;

        System.out.println("FizzBuzz Exercise");
        while(i <= 100){

            if (i % 3 == 0 & i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
            i++;
        }

            }

        }

//        System.out.println("What number would you like to go up to? (Integers only)");
//
//        int enterInt = scan.nextInt();
//        System.out.println(enterInt);
//        int x = 1;
//        System.out.print("number");
//        System.out.print(" | ");
//        System.out.print("squared");
//        System.out.print(" | ");
//        System.out.print("cubed");
//        System.out.println(" ");
//        while(x <= enterInt){
//            int squared = x * x;
//            int cubed = x * x * x;
//            System.out.println("   " + x + "        " + squared + "       " + cubed);
//            x++;

//        }



//    }
//}

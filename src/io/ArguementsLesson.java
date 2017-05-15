/**
 * Created by michaelfestger on 5/15/17.
 */

package io;

public class ArguementsLesson {
    public static void main(String[] args) {
        // Composition

        // Expression. It returns value.
        // Expressions have a type.
        // input -> process -> output
        // Functions == sub-programs
        // public static <return type> /*output */ <method-name>(<input or parameters>) {}

        // output -> return type
        // input -> parameters
        // process -> method body

        System.out.println(multiplication(2, 5));

    }
    public static long multiplication(long number1, long number2){
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        if (number2 == 1) return number1;
        else return number1 + multiplication(number1, number2 -1);

    }
}

/**
 * Created by michaelfestger on 5/9/17.
 */
package io;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 100){
            System.out.println(i);
            i++;
            if (i % 3 == 0){
                System.out.println("fizz");
            } else if (i % 5 == 0){
                System.out.println("buzz");
            }  if (i % 3 == 0 & i % 5 == 0){
                System.out.println("FizzBuzz");
            }
        }

    }
}

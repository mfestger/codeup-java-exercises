
/**
 * Created by michaelfestger on 5/11/17.
 */

package io;
public class MethodsExercise {
    public static void main(String[] args) {
addition(5);
subtraction(10);
multiplication(5);
division(10);
modular(2);
multiplyHardMode(5, 5);
    }

    public static void addition(int number){
        int n = number;
        System.out.println(n + n);
    }
    public static void subtraction(int number){
        int n = number;
        System.out.println(n - 6);
    }
    public static void multiplication(int number){
        int n = number;
        System.out.println(n * n);
    }
    public static void division(int number){
        int n = number;
        System.out.println(n / 2);
        // attempting to divide by 0 will crash
    }
    public static void modular(int number){
        int n = number;
        System.out.println(10 % n);
        System.out.println(17 % n);
    }
    public static void multiplyHardMode(int number, int x){
        int n = number;
        int z = x;
        for(int i = 0; i < n; i++){
            n += z;
        }
        System.out.println(n++);
    }


}

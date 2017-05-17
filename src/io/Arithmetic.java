package io;

/**
 * Created by michaelfestger on 5/8/17.
 */
public class Arithmetic {
    public static void main(String[] args) {
        int m = 5 * 4 % 3;
        System.out.println(m);

        int x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);



        double number1 = 12;
        double number2 = 6.5;

        System.out.println(number1 + number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);

        int number3 = 10;
        int number4 = 4;

        System.out.println(number3 % number4);
        System.out.println(number3 % number4);

        number4 += 1;

        System.out.println(number4);

        // an implicit casting

        int anIntergerNumber = 23;
        double aDouble = anIntergerNumber;

        System.out.println(aDouble);


        double anotherNumber = 3.45;
        int aSmallerNumber = (int) anotherNumber; // cast is explicit

        System.out.println(aSmallerNumber);


    }


}

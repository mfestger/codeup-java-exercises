package io;
import java.util.Scanner;
/**
 * Created by michaelfestger on 5/18/17.
 */
public class ArraysLecture {
    public static void main(String[] args) {

        // If you try and access a double array position that has no value, it will be 0.0.
        double[] prices; // variable declaration
        prices = new double[4]; // initialize and specify the size of the array
        prices[3] = 12.5;
        System.out.println(prices[0]);

        // If you try and access a String array position that has no value, it will be null. Also, first position is always null.
        String[] names;
        names = new String[6];
        System.out.println(names[3]);

        // If you try and access a boolean array position that has no value, it will be false.
        boolean[] apples; // variable declaration
        apples = new boolean[10]; //variable initialization
        System.out.println(apples[4]);

        // If you try and access an int array position that has no value, it will be 0.
        int[] oranges = new int[20];
        System.out.println(oranges[3]);

        Scanner input = new Scanner(System.in);
        System.out.println("How many elements should this array have?");
        int size = input.nextInt();
        int[] elements = new int[size];
        System.out.println("You want an array with the size of " + size + ", got it.");

        String[] beatles = {"John", "Paul", "George", "Ringo"};
        System.out.println(beatles[2].toUpperCase());

//        Product[] products = new Product[10];
//        products[0] = new Product("Mango", 2.5);
//
//        Product[] moreProducts = {
//          new Product("Mango", 2.5),
//          new Product("Coke", 1.5)
//        };
//        System.out.println(moreProduts[0].format());
        System.out.println(beatles[beatles.length - 1]); // This gets you all contents in the array

    }


}

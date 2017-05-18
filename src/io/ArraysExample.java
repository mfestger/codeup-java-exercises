package io;
import java.util.Arrays;
/**
 * Created by michaelfestger on 5/18/17.
 */
public class ArraysExample {
    public static void main(String[] args) {
        int[] prices = new int[10];

        for(int price: prices){
            System.out.println(price);
        }

        Arrays.fill(prices, 5);
        for(int price: prices) {
            System.out.println(price);
        }

        int[] threeNumbers = {1, 2, 3};
        int[] sameThreeNumbers = {1, 3, 2}; //altered for line 33

        // Are these two variables the same? (Do they point to the same memory address?)
        System.out.println(threeNumbers == sameThreeNumbers); // No. This prints "false"

        //do these arrays have the same content?
        System.out.println(Arrays.equals(threeNumbers, sameThreeNumbers)); // Yes. This prints "true".
        // in order to be true, the same content must exist in the same order. Otherwise, "false"

        //  this prints out the memory location
        int[] thirdCopy = Arrays.copyOf(threeNumbers, threeNumbers.length);
        System.out.println(thirdCopy);

        Arrays.sort(sameThreeNumbers); // sorts the array (by value?)
        System.out.println(Arrays.equals(threeNumbers, sameThreeNumbers)); // Because of line 33 this prints "true"

        // lets comb through an array and find specific values.
        int[] moreNumbers = {2, 56, 7, 34, 20, 45, 67};
        int index = Arrays.binarySearch(moreNumbers, 34);
        System.out.println("34 is at index: " + index);


        // If you search for a value that isn't in the array, you get "-1" for integers.
        int index2 = Arrays.binarySearch(moreNumbers, -56);
        System.out.println("-56 is at index: " + index2);





    }
}

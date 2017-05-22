package io;

/**
 * Created by michaelfestger on 5/22/17.
 */
import java.util.ArrayList;
public class ListExamples {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Mike");
        list.add(1);
        list.add(true); // type unsafe

        System.out.println(list.isEmpty()); // prints false
        System.out.println(list.size()); // prints 3

        // Generics
        ArrayList<String> strings = new ArrayList<>(); // <strings> will only accept String types
        strings.add("Mike");
        strings.add("Festger");

        // Boxing -> Wrapper classes from primitive types
        // int -> Integer
        // double -> Double
        // float -> Float
        ArrayList<Integer> integers = new ArrayList<Integer>(); // "int" will not work, must be "Integer"
        integers.add(29);
        integers.add(10);
    }
}

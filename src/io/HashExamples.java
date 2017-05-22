/**
 * Created by michaelfestger on 5/22/17.
 */
package io;

import java.util.HashMap;
import java.util.Map;

public class HashExamples {
    public static void main(String[] args) {

        // key - value

        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        // call a value by it's key
        System.out.println(map.get("one")); // this prints "1"
        System.out.println(map.get("four")); // this prints "4"

//        for(int i = 0; i < map.size(); i++){
//            System.out.println(map.get(i)); // < -- this will result in null
//        }

        map.forEach((key, value) -> {
            System.out.println("key: " + key + ", value: " + value);



        });

    }
}

/**
 * Created by michaelfestger on 5/22/17.
 */
package io;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        Student2 david = new Student2("David", 80);
        Student2 veronica = new Student2("Veronica", 100);
        Student2 russel = new Student2("Russel", 75);
        Student2 kira = new Student2("Kira", 98);

        Map<Student2, String> students = new HashMap<>();
        students.put(david, "clefCity");
        students.put(veronica, "whisperluvr");
        students.put(russel, "wtf-is-github");
        students.put(kira, "kira_bug");
        System.out.println("Welcome!");
        System.out.println();
        System.out.println("| " + students.get(david) + " | " + students.get(veronica) + " | " + students.get(russel) + " | " + students.get(kira) + " | ");
        System.out.println();
        System.out.println("Which student would you like more information on?");




    }




}

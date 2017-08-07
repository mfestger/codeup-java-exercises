/**
 * Created by michaelfestger on 5/22/17.
 */
package io;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static String name;
    public static int grade;
    private static Scanner input;

    public static void main(String[] args) {
        ArrayList<Integer> gradeArray = new ArrayList<>();
        input = new Scanner(System.in);
        Student2 david = new Student2("David", 80);
        gradeArray.add(grade);
        Student2 veronica = new Student2("Veronica", 100);
        gradeArray.add(grade);
        Student2 russel = new Student2("Russel", 75);
        gradeArray.add(grade);
        Student2 kira = new Student2("Kira", 98);
        gradeArray.add(grade);

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
        String studentSelect = input.nextLine();

        switch (studentSelect){
            case "clefCity":
                System.out.println("Name: David" + " | " + "Github username: " + students.get(david));
                System.out.println("Current average: ");
                averageCalc();
                break;
            case "whisperluvr":
                break;
            case "wtf-is-github":
                break;
            case "kira_bug":
                break;
                default:
                    System.out.println("Sorry, no student found with the github username of " + studentSelect);
                    System.out.println("Would you like to see another student? (y for yes, else no.");
                    String stupidUser = input.nextLine();

                    switch (stupidUser){
                        case "y":
                            break;
                        case "n":
                            System.out.println("Please come again.");
                            System.exit(0);
                    }
        }



    }

    public GradesApplication(String name, int grade){

        this.name = name;
        this.grade = grade;
    }

    public static void averageCalc(){
        ArrayList<Integer> gradeArray = new ArrayList<>();
        double sum = 0;
        for (int grade : gradeArray){
            sum += grade;
        }
        double average = sum / gradeArray.size();
    }




}

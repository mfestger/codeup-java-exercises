
/**
 * Created by michaelfestger on 5/22/17.
 */
package io;

import java.util.ArrayList;


public class Student2 {
    public static String name;
    public static int grade;

    public Student2(String name, int grade){
        this.name = name;
        this.grade = grade;
    }


    public static void main(String[] args) {
        ArrayList <Integer> gradeArray = new ArrayList<>();
        Student2 mike = new Student2("Mike", 90);
        gradeArray.add(grade);
        Student2 suzee = new Student2("Suzee", 100);
        gradeArray.add(grade);
        Student2 chris = new Student2("Chris", 80);
        gradeArray.add(grade);
        Student2 lani = new Student2("Lani", 95);
        gradeArray.add(grade);

// average should be 91.25

        double sum = 0;
        for (int grade : gradeArray){
            sum += grade;
        }
        double average = sum / gradeArray.size();
        System.out.println("The average grade is: " + average);
    }


}






//private String studentName;
//        int grade;
//        ArrayList<Integer> grades = new ArrayList<>();
//
//
//public Student2(String studentName, int grade) {
//        this.studentName = studentName;
//        this.grade = grade;
//        }
//
//public String getStudentName() {
//        System.out.println(studentName);
//        return studentName;
//        }
//
//public void addGrade(int grade) {
//        grades.add(grade);
//        }
//
//
//public double getGradeAverage() {
//        for (int grade : grades) {
//        double average = +grade;
//        average = average * grades.size();
//        System.out.println(average);
//
//        }
//        System.out.println(getGradeAverage());
//        return getGradeAverage();
//        }
//
//public static void main(String[] args) {
//        Student2 mike = new Student2("Mike", 100);
//        Student2 suzee = new Student2("Suzee", 99);
//        Student2 chris = new Student2("Chris", 90);
//        Student2 lani = new Student2("Lani", 95);




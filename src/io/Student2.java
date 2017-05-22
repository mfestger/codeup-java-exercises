
/**
 * Created by michaelfestger on 5/22/17.
 */
package io;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student2 {

    private String studentName;
    ArrayList<Integer> grades = new ArrayList<>();


    public Student2(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName(){
        System.out.println(studentName);
        return studentName;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        for(int grade : grades){
            double average =+ grade;
            average = average * grades.size();
            System.out.println(average);

        }
        return getGradeAverage();
    }

    public static void main(String[] args) {

    }



}

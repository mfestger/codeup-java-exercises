
/**
 * Created by michaelfestger on 5/22/17.
 */
package io;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student2 {

    private String studentName;
    int grade;
    ArrayList<Integer> grades = new ArrayList<>();


    public Student2(String studentName, int grade) {
        this.studentName = studentName;
        this.grade = grade;
    }

    public String getStudentName() {
        System.out.println(studentName);
        return studentName;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }


    public static void main(String[] args) {
        Student2 mike = new Student2("Mike", 100);
        Student2 suzee = new Student2("Suzee", 99);
        Student2 chris = new Student2("Chris", 90);
        Student2 lani = new Student2("Lani", 95);
    }
    public double getGradeAverage() {
        for (int grade : grades) {
            double average = +grade;
            average = average * grades.size();
            System.out.println(average);

        }
        return getGradeAverage();
    }

}







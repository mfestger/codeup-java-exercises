package io;

/**
 * Created by michaelfestger on 5/19/17.
 */
public class InheritanceApplication {
    public static void main(String[] args) {
        // The Person class
        Person mike = new Person("Mike", 29, 'M');
        System.out.println(mike.description());
        // The Person > Student class
        // Example 1
        Student dude = new Student("Dude", 29, 'M', "Pinnacles", "Java");
        System.out.println(dude.description());
        // Example 2
        Student student2 = new Student("Suzee", 32, 'F', "Pizza Hut", "Pizza");
        System.out.println(student2.description());

        //student.name = "Zach"; as this is protected is not visible outside the package

        Person[] people = {

                new Person("Ben", 20, 'M'),
                new Person ("Matilda", 6, 'F'),
                new Person ("Diana Prince", 29, 'F'),
                mike,
                dude

        };
        for(Person person : people){
            System.out.println(person.description());
        }

        Student[] students = {
                new Student("Bruce Wayne", 30, 'M', "Bat Family", "Kickin' butt"),
        };
        for(Student student : students){
            System.out.println(student.description());
        }

    }

}

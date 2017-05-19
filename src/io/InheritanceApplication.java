package io;

/**
 * Created by michaelfestger on 5/19/17.
 */
public class InheritanceApplication {
    public static void main(String[] args) {
        Person person = new Person("Mike", 29, 'M');
        System.out.println(person.description());

        Student student1 = new Student("Mike", 29, 'M', "Pinnacles", "Java");
        System.out.println(student1.description());

        Student student2 = new Student("Suzee", 32, 'F', "Pizza Hut", "Pizza");
        System.out.println(student2.description());
    }

}

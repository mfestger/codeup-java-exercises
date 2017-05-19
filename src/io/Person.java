package io;

/**
 * Created by michaelfestger on 5/19/17.
 */
public class Person {
    protected String name; //protected is between private and public. Public for children, private for anything else
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String description() {
        return String.format("This is %s and he/she is %d years old", name, age);
    }

    public static void main(String[] args) {
        Person person = new Person("Mike", 29, 'M');
        System.out.println(person.description());

    }
}


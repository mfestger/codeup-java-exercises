/**
 * Created by michaelfestger on 5/19/17.
 */
package io.Abstract_Interfaces;
abstract class Employee {

    private double salary;
    private String name;

    public Employee(String name, double salary){
        this.salary = salary;
        this.name = name;
    }

    public abstract String work();

public double getPay(){
    return this.salary;
}

}


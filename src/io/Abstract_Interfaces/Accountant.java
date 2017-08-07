/**
 * Created by michaelfestger on 5/19/17.
 */
package io.Abstract_Interfaces;



public class Accountant extends Employee {
    @Override
    public String work() {
        return "Accountant";
    }

    public Accountant(String name, double salary) {
        super(name, salary);
    }
}

/**
 * Created by michaelfestger on 5/19/17.
 */
package io.Abstract_Interfaces;

abstract class Developer extends Employee implements Code {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String work() {
        return "Developer";
    }
}

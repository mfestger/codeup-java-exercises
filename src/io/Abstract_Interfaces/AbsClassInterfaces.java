/**
 * Created by michaelfestger on 5/19/17.
 */
package io.Abstract_Interfaces;

public class AbsClassInterfaces {
    public static void main(String[] args) {
//        Developer mike = new Developer("Mike", 4000);
//        System.out.println(mike.work());
//        System.out.println(mike.getPay());

        Accountant stacy = new Accountant("Stacy", 6000);
        System.out.println(stacy.work());
        System.out.println(stacy.getPay());
    }
}

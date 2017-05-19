/**
 * Created by michaelfestger on 5/19/17.
 */

package io;

// "Is a" - > sub-classification
// Inheretance -> [this] is a more specific [this]
public class Animal {


    class Feline extends Animal { // Feline is an animal

    }

    class Cat extends Feline { // Cat is a feline

    }

    class Canine extends Animal { // A Canine is an anmial

    }

    class Dog extends Canine { // A Dog is a Canine

    }

}

class Transportation {


    class Ship extends Transportation { // Ship is a Transportation

    }

    class Airplanes extends Transportation { // Airplanes is a Transportation

    }

}

